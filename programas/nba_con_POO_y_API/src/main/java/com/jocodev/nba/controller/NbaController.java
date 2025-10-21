package com.jocodev.nba.controller;

import com.jocodev.nba.model.Equipo;
import com.jocodev.nba.model.Jugador;
import com.jocodev.nba.service.NBAService;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  // Permite llamadas desde el frontend
public class NbaController {

    private final NBAService service = new NBAService();

    @GetMapping("/jugadores")
    public List<Jugador> obtenerJugadores() throws IOException, InterruptedException {
        return service.obtenerJugadores();
    }

    @GetMapping("/equipos")
    public List<Equipo> obtenerEquipos() throws IOException, InterruptedException {
        return service.obtenerEquipos();
    }
}
