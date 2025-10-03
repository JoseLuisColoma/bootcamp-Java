/*
Ejercicio 13
Escribe un programa que ordene tres números enteros introducidos por teclado.
 */

import java.util.Scanner;

public class Ej013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        int temp;

        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3 ){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2 + ", " + num3);

    }

    
}

