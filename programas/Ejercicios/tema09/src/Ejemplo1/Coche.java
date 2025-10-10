package Ejemplo1;

public class Coche extends Vehiculo {

    private int puertas;

    // Constructor
    public Coche(String marca, int anyo, int puertas) {
        super(marca, anyo);
        this.puertas = puertas;
    }

    public Coche(String marca, int anyo) {
        super(marca, anyo);
    }

    // Métodos propios
    public void arrancar() {
        System.out.println("El coche arranca");
    }

    public void mostrarCantidadPuertas() {
        System.out.println("Puertas: " + puertas);
    }

    //métodos heredados
    @Override
    public void mover(){
        System.out.println("El vehículo avanza por la carretera");
    }

    // Getter y setter
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", año=" + anyo +
                ", puertas=" + puertas +
                '}';
    }
}
