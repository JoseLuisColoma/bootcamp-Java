public class Tarea extends Actividad {
    private int prioridad;

    public Tarea(String id, String nombre, int prioridad) {
        super(id, nombre);
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando tarea: " + getNombre() + " (Prioridad: " + prioridad + ")");
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " | " + getNombre() + " | Prioridad: " + prioridad;
    }
}
