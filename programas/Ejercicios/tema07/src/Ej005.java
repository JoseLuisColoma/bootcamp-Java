/*
Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 */

import java.util.Scanner;

public class Ej005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CANTIDAD_NUMEROS = 10;
        int[] numeros = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            System.out.print("Introduce un número (" + (i + 1) + "/" + CANTIDAD_NUMEROS + "): ");
            numeros[i] = sc.nextInt();
        }
            int maximo = numeros[0];
            int minimo = numeros[0];

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            if (numeros[i] == maximo) {
                System.out.println(numeros[i] + "  (máximo)");
            } else if (numeros[i] == minimo) {
                System.out.println(numeros[i] + "  (mínimo)");
            } else {
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}
