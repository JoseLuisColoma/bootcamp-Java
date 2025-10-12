/*
Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ej003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CANTIDAD_NUMEROS = 10;
        int[] numeros = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            System.out.println("Introduce un número por teclado: ");
            numeros[i] = sc.nextInt();
        }

        int[] numeros_inversos = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            numeros_inversos[i] = numeros[CANTIDAD_NUMEROS-1-i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros_inversos));

        sc.close();
    }
}
