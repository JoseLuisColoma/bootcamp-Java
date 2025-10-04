/*
Ejercicio 23
Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.
Ejemplo:
Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible 25.00
IVA (10%) 2.50
Precio con IVA 27.50
Cód. promo. (mitad): -13.75
TOTAL 13.75
 */

import java.util.Scanner;

public class Ej023 {

    public static void main(String[] args) {

        // Constantes IVA
        final double IVA_GENERAL = 0.21;
        final double IVA_REDUCIDO = 0.10;
        final double IVA_SUPERREDUCIDO = 0.04;

        // Códigos promocionales
        final String NO_PROMO = "nopro";
        final String DESC_50_POR_CIENTO = "mitad";
        final String DESC_5_EUROS = "meno5";
        final String DESC_5_POR_CIENTO = "5porc";

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = sc.nextLine().toLowerCase();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromo = sc.nextLine().toLowerCase();

        double importeConIva = 0;
        double importeTotal = 0;
        double importeDescuento = 0;
        double valorIvaPorcentaje = 0;

        // Calcular precio con IVA
        switch (tipoIva) {
            case "general" -> {
                importeConIva = baseImponible * (1 + IVA_GENERAL);
                valorIvaPorcentaje = 21;
            }
            case "reducido" -> {
                importeConIva = baseImponible * (1 + IVA_REDUCIDO);
                valorIvaPorcentaje = 10;
            }
            case "superreducido" -> {
                importeConIva = baseImponible * (1 + IVA_SUPERREDUCIDO);
                valorIvaPorcentaje = 4;
            }
            default -> {
                System.out.println("Tipo de IVA no válido.");
                sc.close();
                return;
            }
        }

        // Aplicar promoción
        switch (codigoPromo) {
            case NO_PROMO -> {
                importeTotal = importeConIva;
                importeDescuento = 0;
            }
            case DESC_50_POR_CIENTO -> {
                importeDescuento = importeConIva / 2;
                importeTotal = importeConIva - importeDescuento;
            }
            case DESC_5_EUROS -> {
                importeDescuento = 5;
                importeTotal = importeConIva - 5;
            }
            case DESC_5_POR_CIENTO -> {
                importeDescuento = importeConIva * 0.05;
                importeTotal = importeConIva - importeDescuento;
            }
            default -> {
                System.out.println("Código promocional no válido.");
                sc.close();
                return;
            }
        }

        // Mostrar resultados con formato
        System.out.printf("Base imponible: %.2f€%n", baseImponible);
        System.out.printf("IVA (%.0f%%): %.2f€%n", valorIvaPorcentaje, importeConIva - baseImponible);
        System.out.printf("Precio con IVA: %.2f€%n", importeConIva);
        System.out.printf("Cód. promo. (%s): -%.2f€%n", codigoPromo, importeDescuento);
        System.out.printf("TOTAL: %.2f€%n", importeTotal);

        sc.close();
    }
}


