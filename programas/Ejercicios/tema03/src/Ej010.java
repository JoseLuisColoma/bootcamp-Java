/*
Ejercicio 10
Realiza un conversor de Mb a Kb.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Introduce la cantidad en Mb: ");
        double mb = sc.nextDouble();

        // Conversión: 1 Mb = 1024 Kb
        double kb = mb * 1024;

        System.out.printf(df.format(mb) + " Mb son " + df.format(kb) + " kb");
    }
}
