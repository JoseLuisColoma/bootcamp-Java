package com.jocodev.nba;

import com.jocodev.nba.model.Jugador;
import com.jocodev.nba.model.Equipo;
import com.jocodev.nba.service.NBAService;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        NBAService servicio = new NBAService();

        try {
            System.out.println("=== JUGADORES NBA ===");
            List<Jugador> jugadores = servicio.obtenerJugadores();

            System.out.printf("%-25s | %-10s | %s%n", "Nombre", "Posición", "Equipo");
            System.out.println("-------------------------------------------------------------");
            for (Jugador j : jugadores) {
                System.out.printf("%-25s | %-10s | %s%n", j.getNombre(), j.getPosicion(), j.getEquipo());
            }

            System.out.println("\n=== EQUIPOS NBA ===");
            List<Equipo> equipos = servicio.obtenerEquipos();

            System.out.printf("%-25s | %-15s | %-15s | %-15s%n",
                    "Equipo", "Ciudad", "Conferencia", "División");
            System.out.println("-----------------------------------------------------------------------");
            for (Equipo e : equipos) {
                System.out.printf("%-25s | %-15s | %-15s | %-15s%n",
                        e.getNombre(), e.getCiudad(), e.getConferencia(), e.getDivision());
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
        }
    }
}
