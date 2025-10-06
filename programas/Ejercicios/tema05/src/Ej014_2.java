/*
Ejercicio 14
Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia
 */

/* Sencillo empleando la clase MAth */

import java.util.Scanner;
import java.lang.Math;

public class Ej014_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = sc.nextInt();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = sc.nextInt();

        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
            return;
        }

        long potencia = 1; // inicializamos en 1 para manejar correctamente exponente=0

        potencia = (long) Math.pow(base, exponente);

        System.out.printf("%d ^ %d = %d%n", base, exponente, potencia);

        sc.close();
    }
}

