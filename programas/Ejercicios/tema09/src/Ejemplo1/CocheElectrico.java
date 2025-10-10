package Ejemplo1;

public class CocheElectrico extends Coche implements Electrico{
    public CocheElectrico(String marca, int anyo, int puertas) {
        super(marca, anyo, puertas);
    }

    @Override
    public void cargarBateria(){
        System.out.println("Cargando batería del coche eléctrico...");
    }

    @Override
    public void arrancar(){
        System.out.println("El coche electrico se arranca con una tarjeta");
    }



}
