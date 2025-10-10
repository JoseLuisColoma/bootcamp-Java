package Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Seat Ibiza", 2010, 3);

        coche1.arrancar();
        coche1.mostrarCantidadPuertas();

        System.out.println(coche1.toString());
        System.out.println("Mi coche es un " + coche1.getMarca() + " del año " + coche1.getAnyo());
        System.out.println(coche1.getPuertas());

        Vehiculo coche2 = new Coche("Seat Ibiza", 2010, 3);
        Vehiculo2 moto1 = new Motocicleta();

        coche2.mover();
        moto1.encender();

        CocheElectrico tesla = new CocheElectrico("Tesla", 2025, 5);
        tesla.cargarBateria();
        tesla.arrancar();

    }
}

// Comentarios
/*
| Elemento             | Explicación                                                                  |
| -------------------- | ---------------------------------------------------------------------------- |
| `Vehiculo`           | Clase base (padre), define atributos comunes.                                |
| `Coche`              | Clase hija, hereda `marca` y `anyo` y añade `puertas`.                       |
| `super(marca, anyo)` | Llama al constructor del padre.                                              |
| `protected`          | Permite que las subclases accedan a los atributos heredados.                 |
| `Main`               | Clase independiente que contiene el `main()`, punto de entrada del programa. |
*/
