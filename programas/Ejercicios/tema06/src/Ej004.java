/*
Ejercicio 4
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios.
 */

public class Ej004 {
    public static void main(String[] args) {

        final int CANTIDAD_NUMEROS = 20;
        final int MAXIMO = 11;

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            System.out.print((int)(Math.random()*MAXIMO) + " ");
        }
    }
}
