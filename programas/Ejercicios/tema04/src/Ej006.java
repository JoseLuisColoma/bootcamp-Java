/*
Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = Math.sqrt(2*altura/g), siendo g = 9:81m/s2
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej006 {
    public static void main(String[] args) {

        final double g = 9.81;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Introduce el valor de h (en metros): ");
        double altura = sc.nextDouble();

        if (altura < 0) {
            System.out.println("La altura no puede ser negativa.");
            return;
        }

        double tiempo = Math.sqrt(2*altura/g);

        System.out.println("t = " + df.format(tiempo) + " segundos");

    }
}

