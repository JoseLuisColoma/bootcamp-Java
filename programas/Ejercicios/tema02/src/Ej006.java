/*Ejercicio 6
Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.*/

public class Ej006 {
    public static void main(String[] args) {

        double baseImponible = 100;
        double totalFactura = 0;
        final double IVA = 0.21;

        totalFactura = baseImponible * (1 + IVA);

        System.out.println("Base imponible: " + baseImponible + "€");
        System.out.println("IVA 21%");
        System.out.println("======================================");
        System.out.println("Total Factura: " + totalFactura + "€");
    }
}