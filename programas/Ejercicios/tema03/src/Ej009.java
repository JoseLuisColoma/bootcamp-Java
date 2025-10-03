/*
Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3*PI*r2*h
 */

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Ej009 {
    public static void main(String[] args) {

        final double PI = Math.PI;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del cono:");
        double radio = sc.nextDouble();
        System.out.println("Introduce la altura del cono:");
        double altura = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("0.000");

        double volumen = (PI*Math.pow(radio, 2)*altura)/3;
        System.out.printf("Volumen del cono: " + df.format(volumen) + " u3");
    }
}
