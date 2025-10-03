/*
Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 */

import java.util.Scanner;

public class Ej004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Dame el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + division);

    }
}
