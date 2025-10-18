/*
Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 */

public class Ej001 {
    public static void main(String[] args) {
        System.out.println("Suma de 3 dados");
        final int NUM_CARAS = 6;
        final int NUM_DADOS = 3;
        int total = 0;

        for (int i = 0; i < NUM_DADOS ; i++) {
            int dado = (int)(Math.random()*NUM_CARAS +1);
            System.out.println("Dado " + (i+1) + ": " + dado);
            total += dado;

        }
        System.out.println("Suma total: " + total);

    }
}
