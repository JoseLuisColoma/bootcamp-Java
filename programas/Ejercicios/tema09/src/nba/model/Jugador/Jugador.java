package nba.model.Jugador;

public class Jugador {
    protected String nombre;
    protected String posicion;
    protected String equipo;

    public Jugador(String nombre, String posicion, String equipo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getNombre() { return nombre; }
    public String getPosicion() { return posicion; }
    public String getEquipo() { return equipo; }

    public void mostrarInfo() {
        System.out.printf("%-25s | %-10s | %s%n", nombre, posicion, equipo);
    }
}
