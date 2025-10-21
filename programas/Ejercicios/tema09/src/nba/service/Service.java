package nba.service;
import nba.model.Jugador.Jugador;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class NBAService {
    private static final String API_URL = "https://api.balldontlie.io/v1/players?per_page=10";

    public List<Jugador> obtenerJugadores() throws IOException, InterruptedException {
        List<Jugador> jugadores = new ArrayList<>();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject json = new JSONObject(response.body());
        JSONArray data = json.getJSONArray("data");

        for (int i = 0; i < data.length(); i++) {
            JSONObject jugador = data.getJSONObject(i);
            JSONObject equipo = jugador.getJSONObject("team");

            String nombre = jugador.getString("first_name") + " " + jugador.getString("last_name");
            String posicion = jugador.optString("position", "N/A");
            String nombreEquipo = equipo.getString("full_name");

            jugadores.add(new Jugador(nombre, posicion, nombreEquipo));
        }

        return jugadores;
    }
}
