/*
Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax^2 + bx + c = 0).
*/

import java.util.Scanner;

public class Ej009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax^2 + bx + c = 0");

        System.out.print("Por favor, introduzca el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ahora introduzca el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Ahora introduzca el valor de c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            // La ecuación se convierte en bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones.");
                } else {
                    System.out.println("La ecuación no tiene solución.");
                }
            } else {
                double x = -c / b;
                System.out.println("Es una ecuación de primer grado. Solución: x = " + x);
            }
        } else {
            // Ecuación de segundo grado
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales.");
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
