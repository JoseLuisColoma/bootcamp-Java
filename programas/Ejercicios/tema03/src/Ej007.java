/*
Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base
imponible
 */

import java.util.Scanner;

public class Ej007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base imponible de la factura: ");
        double baseImponible = sc.nextDouble();

        double totalFactura = 0;
        final double IVA = 0.21;

        totalFactura = baseImponible * (1 + IVA);

        System.out.println("Base imponible: " + baseImponible + "€");
        System.out.println("IVA 21%");
        System.out.println("======================================");
        System.out.println("Total Factura: " + totalFactura + "€");
    }
}
