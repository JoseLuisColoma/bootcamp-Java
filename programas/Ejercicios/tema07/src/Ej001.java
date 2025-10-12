/*
Ejercicio 1
Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 */

public class Ej001 {

        public static void main(String[] args) {

            // Definición del array de 12 enteros
            int[] num = new int[12];

            // Asignación de valores según el enunciado
            num[0] = 39;
            num[1] = -2;
            num[4] = 0;
            num[6] = 14;
            num[8] = 5;
            num[9] = 120;

            // Mostrar todos los elementos del array
            System.out.println("Contenido del array 'num':");

            for (int i = 0; i < num.length; i++) {
                System.out.println("Índice " + i + " -> " + num[i]);
            }
            System.out.println("----------------");
            for (int valor: num){
                System.out.println(valor);
            }

        }
}

// Los valores de los índices del array que no han sido inicializados
// los inicializa a cero automáticamente por defecto
