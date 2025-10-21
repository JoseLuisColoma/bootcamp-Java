package nba.model.Equipo;

public class Equipo {
    private String nombre;
    private String ciudad;
    private String conferencia;

    public Equipo(String nombre, String ciudad, String conferencia) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.conferencia = conferencia;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public String getConferencia() { return conferencia; }

    public void mostrarInfo() {
        System.out.println("Equipo: " + nombre + " | Ciudad: " + ciudad + " | Conferencia: " + conferencia);
    }
}
