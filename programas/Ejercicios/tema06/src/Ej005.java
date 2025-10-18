/*
Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 */

import java.util.Arrays;


public class Ej005 {
    public static void main(String[] args) {

        final int CANTIDAD_NUMEROS = 50;
        final int MINIMO = 100;
        final int MAXIMO = 200;
        int[] numeros = new int[CANTIDAD_NUMEROS];
        int maximo = 0;
        int minimo = 0;
        int suma = 0;
        float media;

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            numeros[i] = (int)(Math.random()*MINIMO + MINIMO);
            System.out.print(numeros[i] + " ");
            suma += numeros[i];
        }
        //maximo = max(numeros);
        //minimo = min(numeros);
        media = (float) (suma/(numeros.length));
        System.out.println("\n>> máximo: " + maximo);
        System.out.println(">> mínimo: " + minimo);
        System.out.println(">> media: " + media);
    }
}
