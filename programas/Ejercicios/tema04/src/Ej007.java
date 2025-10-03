/*
Ejercicio 7
Realiza un programa que calcule la media de tres notas.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final int NUM_NOTAS = 3;

        System.out.println("Introduce la 1ª nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la 2ª nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduce la 3ª nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/NUM_NOTAS;

        System.out.println("Nota Media: " + df.format(media));
    }
}

