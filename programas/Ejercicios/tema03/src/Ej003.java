/*
Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado
 */

import java.util.Scanner;

public class Ej003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double CONVERSOR_PESETAS_A_EUROS = 1 / 166.386;

        System.out.println("CONVERSOR DE PESETAS A EUROS");
        System.out.println("Dame la cantidad en Pesetas y lo convierto en Euros: ");
        double cantidadPesetas = sc.nextDouble();
        double total = cantidadPesetas * CONVERSOR_PESETAS_A_EUROS;
        System.out.println(cantidadPesetas + " pesetas son " + total + "€");

    }

}
