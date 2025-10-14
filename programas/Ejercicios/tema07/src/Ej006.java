/*
Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ej006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CANTIDAD_NUMEROS = 15; // según el enunciado
        int[] numeros = new int[CANTIDAD_NUMEROS];
        int[] numerosRotados = new int[CANTIDAD_NUMEROS];

        // Entrada de datos
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            System.out.print("Introduce un número (" + (i + 1) + "/" + CANTIDAD_NUMEROS + "): ");
            numeros[i] = sc.nextInt();
        }

        // Rotar el array una posición a la derecha
        numerosRotados[0] = numeros[CANTIDAD_NUMEROS - 1];
        for (int i = 0; i < CANTIDAD_NUMEROS - 1; i++) {
            numerosRotados[i + 1] = numeros[i];
        }

        // Mostrar resultados
        System.out.println("\nArray original: " + Arrays.toString(numeros));
        System.out.println("Array rotado:   " + Arrays.toString(numerosRotados));

        sc.close();
    }
}
