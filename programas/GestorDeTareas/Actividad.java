public abstract class Actividad {
    private String id;
    private String nombre;

    public Actividad(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void ejecutar();
}

