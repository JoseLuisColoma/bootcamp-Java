/*
Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 */

import java.util.Scanner;

public class Ej023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int LIMITE = 10000;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números enteros (el programa se detendrá al superar 10.000):");

        while (suma < LIMITE) {
            System.out.print("Número: ");
            int numero = sc.nextInt();

            suma += numero;
            contador++;
        }

        double media = (double) suma / contador;

        System.out.println("\n==============================");
        System.out.println("Total acumulado: " + suma);
        System.out.println("Cantidad de números introducidos: " + contador);
        System.out.printf("Media: %.2f%n", media);
        System.out.println("==============================");

        sc.close();
    }
}