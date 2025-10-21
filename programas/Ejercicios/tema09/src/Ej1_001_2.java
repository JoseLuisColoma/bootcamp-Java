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

public class Ej1_001_2 {
    // --- Atributos ---
    private String nombre;
    private String escuderia;
    private String nacionalidad;
    private int edad;
    private int numeroCoche;
    private int puntos;
    private int podios;
    private int numCampeonatos;
    private boolean isCampeonActual;

    // --- Constructor ---
    public Ej1_001_2(String nombre, String escuderia, String nacionalidad,
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCoche() {
        return numeroCoche;
    }

    public void setNumeroCoche(int numeroCoche) {
        this.numeroCoche = numeroCoche;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) {
        this.podios = podios;
    }

    public int getNumCampeonatos() {
        return numCampeonatos;
    }

    public void setNumCampeonatos(int numCampeonatos) {
        this.numCampeonatos = numCampeonatos;
    }

    public boolean isCampeonActual() {
        return isCampeonActual;
    }

    public void setCampeonActual(boolean campeonActual) {
        isCampeonActual = campeonActual;
    }

    // --- Metodo para mostrar información ---
    public void mostrarInformacion() {
        System.out.println("Piloto: " + getNombre() + " (" + getNacionalidad() + ")");
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Escudería: " + getEscuderia() + " | Nº: " + getNumeroCoche());
        System.out.println("Puntos: " + getPuntos() + " | Podios: " + getPodios() + " | Campeonatos: " + getNumCampeonatos());
        System.out.println(isCampeonActual ? "Es el campeón mundial actual" : "No es el campeón mundial actual");
        System.out.println("----------------------------------------");
    }

    // --- Metodo main ---
    public static void main(String[] args) {
        Ej1_001_2 verstappen = new Ej1_001_2(
                "Max Verstappen", "Red Bull Racing", "Países Bajos",
                26, 1, 575, 21, 3, true);

        Ej1_001_2 leclerc = new Ej1_001_2(
                "Charles Leclerc", "Ferrari", "Mónaco",
                27, 16, 308, 12, 0, false);

        Ej1_001_2 alonso = new Ej1_001_2(
                "Fernando Alonso", "Aston Martin", "España",
                43, 14, 178, 8, 2, false);

        verstappen.mostrarInformacion();
        leclerc.mostrarInformacion();
        alonso.mostrarInformacion();

        // --- Ejemplo usando setters ---
        System.out.println("\nActualizando datos de Alonso...");
        alonso.setPuntos(195);
        alonso.setPodios(9);
        alonso.mostrarInformacion();
    }
}
