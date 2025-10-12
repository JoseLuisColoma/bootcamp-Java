/*
Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
 */

import java.util.Arrays;

public class Ej004 {
    public static void main(String[] args) {
        final int CANTIDAD_NUMEROS = 20;
        int[] numeros = new int[CANTIDAD_NUMEROS];
        int[] cuadrados = new int[CANTIDAD_NUMEROS];
        int[] cubos = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            numeros[i] = (int)(Math.random() *100);
            cuadrados[i] = (int)Math.pow(numeros[i],2);
            cubos[i] = (int)Math.pow(numeros[i],3);
        }

        System.out.println("numeros aleatorios: " + Arrays.toString(numeros));
        System.out.println("cuadrados: " + Arrays.toString(cuadrados));
        System.out.println("cubos " + Arrays.toString(cubos));
    }
}
