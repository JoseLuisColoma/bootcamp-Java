/*
Ejercicio 1
¿Cuáles serían los atributos de la clase EJ1_001? ¿Se te ocurren algunas
instancias de esta clase?
*/

/*
    Algunos atributos podrían ser:
    - String nombre	(Nombre del piloto)
    - String escuderia (Nombre del equipo - Ferrari, Red Bull, etc.)
    - String nacionalidad (País de origen)
    - int numeroCoche (Número del coche)
    - int puntos (Puntos acumulados en la temporada)
    - int podios (Número de veces que ha terminado en el podio)
    - boolean campeonActual	(Indica si es el campeón vigente)
*/

// Ej1__001 como PilotoFormula1

public class Ej1_001 {
    // --- Atributos ---
    protected String nombre;
    protected String escuderia;
    protected String nacionalidad;
    protected int edad;
    protected int numeroCoche;
    protected int puntos;
    protected int podios;
    protected int numCampeonatos;
    protected boolean isCampeonActual;

    // --- Constructor ---
    public Ej1_001(String nombre, String escuderia, String nacionalidad,
                   int edad, int numeroCoche, int puntos, int podios,
                   int numCampeonatos, boolean isCampeonActual) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numeroCoche = numeroCoche;
        this.puntos = puntos;
        this.podios = podios;
        this.numCampeonatos = numCampeonatos;
        this.isCampeonActual = isCampeonActual;
    }

    // --- Metodo para mostrar información ---
    public void mostrarInformacion() {
        System.out.println("Piloto: " + nombre + " (" + nacionalidad + ")");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Escudería: " + escuderia + " | Nº: " + numeroCoche);
        System.out.println("Puntos: " + puntos + " | Podios: " + podios + " | Campeonatos: " + numCampeonatos);
        System.out.println(isCampeonActual ? "Es el campeón actual" : "No es el campeón actual");
        System.out.println("----------------------------------------");
    }

    // --- Metodo main ---
    public static void main(String[] args) {
        Ej1_001 verstappen = new Ej1_001(
                "Max Verstappen", "Red Bull Racing", "Países Bajos",
                26, 1, 575, 21, 3, true);

        Ej1_001 leclerc = new Ej1_001(
                "Charles Leclerc", "Ferrari", "Mónaco",
                27, 16, 308, 12, 0, false);

        Ej1_001 alonso = new Ej1_001(
                "Fernando Alonso", "Aston Martin", "España",
                43, 14, 178, 8, 2, false);

        verstappen.mostrarInformacion();
        leclerc.mostrarInformacion();
        alonso.mostrarInformacion();
    }
}
