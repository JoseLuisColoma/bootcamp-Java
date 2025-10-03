/*
Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.
 */

import java.util.Scanner;

public class Ej005 {
    public static void main(String[] args) {

        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.println("Dame la altura del rectángulo: ");
        int altura = sc.nextInt();

        int area = base * altura;
        System.out.println("Area del rectángulo: " + area + " u2");

    }
}
