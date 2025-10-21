/*
Ejercicio 4
Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5
elementos distintos que intervengan en la liga?
 */

public class Ej1_004 {


    // Programa de prueba (main)
    public static void main(String[] args) {
        Jugador[] jugadores = {
                new Jugador("Juan Pérez", 7, "Base", 12.5),
                new Jugador("Carlos López", 23, "Alero", 15.8)
        };

        Entrenador entrenador = new Entrenador("Miguel García", 10, "España");

        Equipo equipo1 = new Equipo("Valencia Basket", "Valencia", entrenador, jugadores);
        Equipo equipo2 = new Equipo("Real Madrid", "Madrid", entrenador, jugadores);

        Equipo[] equipos = {equipo1, equipo2};

        Liga acb = new Liga("Liga ACB", equipos);
        acb.mostrarEquipos();

        Partido partido = new Partido(equipo1, equipo2, 82, 77);
        System.out.println("Resultado: " + partido.resultado());
    }

    // Clase Jugador
    public static class Jugador {
        private final String nombre;
        private final int dorsal;
        private final String posicion; // base, alero, pivot, etc.
        private final double puntosPorPartido;

        public Jugador(String nombre, int dorsal, String posicion, double puntosPorPartido) {
            this.nombre = nombre;
            this.dorsal = dorsal;
            this.posicion = posicion;
            this.puntosPorPartido = puntosPorPartido;
        }
    }

    // Clase Entrenador
    public static class Entrenador {
        private final String nombre;
        private final int aniosExperiencia;
        private final String nacionalidad;

        public Entrenador(String nombre, int aniosExperiencia, String nacionalidad) {
            this.nombre = nombre;
            this.aniosExperiencia = aniosExperiencia;
            this.nacionalidad = nacionalidad;
        }
    }

    // Clase Equipo
    public static class Equipo {
        private final String nombre;
        private final String ciudad;
        private final Entrenador entrenador;
        private final Jugador[] jugadores;

        public Equipo(String nombre, String ciudad, Entrenador entrenador, Jugador[] jugadores) {
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.entrenador = entrenador;
            this.jugadores = jugadores;
        }
    }

    // Clase Partido
    public static class Partido {
        private final Equipo equipoLocal;
        private final Equipo equipoVisitante;
        private final int puntosLocal;
        private final int puntosVisitante;

        public Partido(Equipo local, Equipo visitante, int puntosLocal, int puntosVisitante) {
            this.equipoLocal = local;
            this.equipoVisitante = visitante;
            this.puntosLocal = puntosLocal;
            this.puntosVisitante = puntosVisitante;
        }

        public String resultado() {
            return equipoLocal.nombre + " " + puntosLocal + " - " + puntosVisitante + " " + equipoVisitante.nombre;
        }
    }

    // Clase Liga
    public static class Liga {
        private final String nombre;
        private final Equipo[] equipos;

        public Liga(String nombre, Equipo[] equipos) {
            this.nombre = nombre;
            this.equipos = equipos;
        }

        public void mostrarEquipos() {
            System.out.println("Equipos de la liga " + nombre + ":");
            for (Equipo e : equipos) {
                System.out.println("- " + e.nombre);
            }
        }
    }
}
