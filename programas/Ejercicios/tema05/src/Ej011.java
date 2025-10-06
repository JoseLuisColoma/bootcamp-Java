/*
Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */

import java.util.Scanner;

public class Ej011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        System.out.println("\nNúmero   Cuadrado   Cubo");
        System.out.println("--------------------------");

        for (int i = numero+1; i <= numero + 5; i++) {
            int cuadrado = (int) Math.pow(i, 2);
            int cubo = (int) Math.pow(i, 3);
            System.out.printf("%-8d %-10d %-10d%n", i, cuadrado, cubo);
        }
        sc.close();
    }
}

