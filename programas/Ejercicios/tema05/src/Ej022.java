/*
Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */

public class Ej022 {
    public static void main(String[] args) {

        final int LIMITE = 100;

        System.out.println("Números primos entre 2 y " + LIMITE + ":");

        for (int i = 2; i <= LIMITE; i++) {

            boolean esPrimo = true; // reiniciar para cada número

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break; // ya sabemos que no es primo, salimos
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // salto de línea final
    }
}
