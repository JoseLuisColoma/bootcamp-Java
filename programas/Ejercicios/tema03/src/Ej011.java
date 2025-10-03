/*
Ejercicio 11
Realiza un conversor de Kb a Mb.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

class Ej011 {
    public static void main(String[] args) {

        final int CONVERSION = 1024;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Introduce la cantidad en Kb: ");
        double kb = sc.nextDouble();

        // Conversión: 1 kb = 0.1024 Mb
        double mb = kb / CONVERSION;

        System.out.printf(df.format(kb) + " Kb son " + df.format(mb) + " Mb");
    }
}
