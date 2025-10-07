/*
Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */

import java.util.Scanner;

public class Ej016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El número no es primo (por definición).");
            sc.close();
            return;
        }

        boolean esPrimo = true;

        // Solo es necesario comprobar hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break; // ya sabemos que no es primo, salimos del bucle
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        sc.close();
    }
}
