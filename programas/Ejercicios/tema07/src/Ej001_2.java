/*
Ejercicio 1
Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 */

import java.util.Arrays;

public class Ej001_2 {
    public static void main(String[] args) {
        int[] num = new int[12];

        // Asignar los valores del enunciado
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        // Mostrar el contenido completo en una sola línea
        System.out.println("Contenido del array:");
        System.out.println(Arrays.toString(num));
    }
}

// Los valores de los índices del array que no han sido inicializados
// los inicializa a cero automáticamente por defecto
