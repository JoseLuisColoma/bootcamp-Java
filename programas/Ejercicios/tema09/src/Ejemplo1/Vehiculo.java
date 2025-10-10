
package Ejemplo1;

public abstract class Vehiculo {
    protected String marca;
    protected int anyo;

    // Constructor
    public Vehiculo(String marca, int anyo) {
        this.marca = marca;
        this.anyo = anyo;
    }

    public void mover(){
        System.out.println("El vehículo se mueve");
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
}
