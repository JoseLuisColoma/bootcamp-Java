/*
Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
 */

import java.util.Scanner;

public class Ej015_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base (número real): ");
        double base = sc.nextDouble();

        System.out.print("Introduce el exponente máximo (entero positivo): ");
        int exponente = sc.nextInt();

        if (exponente < 1) {
            System.out.println("El exponente debe ser un número entero positivo.");
            sc.close();
            return;
        }

        double potencia = 1;

        System.out.println("\nPotencias de " + base + " desde 1 hasta " + exponente + ":");

        for (int i = 1; i <= exponente; i++) {
            potencia *= base; // multiplicamos sucesivamente
            System.out.printf("%s ^ %d = %.4f%n", base, i, potencia);
        }

        sc.close();
    }
}

