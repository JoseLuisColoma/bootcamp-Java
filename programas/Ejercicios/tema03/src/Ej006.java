/*
Ejercicio 6
Escribe un programa que calcule el área de un triángulo.
 */

import java.util.Scanner;

public class Ej006 {
    static void main(String[] args) {
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base del triángulo: ");
        int base = sc.nextInt();
        System.out.println("Dame la altura del triángulo: ");
        int altura = sc.nextInt();

        int area = (base * altura) / 2;
        System.out.println("Area del rectángulo: " + area + " u2");

    }
}
