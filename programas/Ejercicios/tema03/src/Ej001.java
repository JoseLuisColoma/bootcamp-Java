/*
Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación
 */

import java.util.Scanner;

public class Ej001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un número: ");
        int num1 = sc.nextInt();
        System.out.print("Dame otro número: ");
        int num2 = sc.nextInt();
        int producto = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + producto );

    }
}
