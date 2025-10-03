/*
Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado
 */

import java.util.Scanner;

public class Ej002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double CONVERSOR_EUROS_A_PESETAS = 166.386;

        System.out.println("CONVERSOR DE EUROS A PESETAS");
        System.out.println("Dame la cantidad en Euros: ");
        double cantidadEuros = sc.nextDouble();
        double total = cantidadEuros * CONVERSOR_EUROS_A_PESETAS;
        System.out.println(cantidadEuros + "€ eran " + total + " pesetas");

    }
}
