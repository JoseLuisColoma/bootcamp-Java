package com.jocodev.nba.service;

import com.google.gson.*;
import com.jocodev.nba.model.Equipo;
import com.jocodev.nba.model.Jugador;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class NBAService {

    private static final String API_URL = "https://api.balldontlie.io/v1";
    private static final String API_KEY = "cb7e9d59-ca5f-43fe-8fec-b76e98e0261f";

    private final HttpClient client = HttpClient.newHttpClient();

    // Cache para no sobrecargar la API
    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    public List<Jugador> obtenerJugadores() throws IOException, InterruptedException {
        if (cache.containsKey("jugadores")) {
            return (List<Jugador>) cache.get("jugadores");
        }

        List<Jugador> jugadores = new ArrayList<>();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + "/players?per_page=100"))
                .header("Authorization", "Bearer " + API_KEY)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 429) {
            System.err.println("Error 429: límite de peticiones alcanzado.");
            return jugadores;
        }

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonArray data = json.getAsJsonArray("data");

        for (JsonElement elem : data) {
            JsonObject jugador = elem.getAsJsonObject();
            JsonObject equipo = jugador.getAsJsonObject("team");

            String nombre = jugador.get("first_name").getAsString() + " " + jugador.get("last_name").getAsString();
            String posicion = jugador.get("position").getAsString();
            String nombreEquipo = equipo.get("full_name").getAsString();

            jugadores.add(new Jugador(nombre, posicion.isEmpty() ? "N/A" : posicion, nombreEquipo));
        }

        cache.put("jugadores", jugadores);
        return jugadores;
    }

    public List<Equipo> obtenerEquipos() throws IOException, InterruptedException {
        if (cache.containsKey("equipos")) {
            return (List<Equipo>) cache.get("equipos");
        }

        List<Equipo> equipos = new ArrayList<>();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + "/teams"))
                .header("Authorization", "Bearer " + API_KEY)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 429) {
            System.err.println("Error 429: límite de peticiones alcanzado.");
            return equipos;
        }

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonArray data = json.getAsJsonArray("data");

        for (JsonElement elem : data) {
            JsonObject e = elem.getAsJsonObject();

            String nombre = e.get("full_name").getAsString();
            String abreviatura = e.get("abbreviation").getAsString();
            String ciudad = e.get("city").getAsString();
            String conferencia = e.get("conference").getAsString();
            String division = e.get("division").getAsString();

            equipos.add(new Equipo(nombre, abreviatura, ciudad, conferencia, division));
        }

        cache.put("equipos", equipos);
        return equipos;
    }
}
