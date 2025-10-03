/*
Ejercicio 14
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 */

import java.util.Scanner;

public class Ej014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0 && numero % 5 == 0){
            System.out.println("El número es par y divisible entre 5");
        } else if (numero % 2 == 0 && numero % 5 != 0) {
            System.out.println("El número es par pero no divisible entre 5");
        } else if (numero % 2 != 0 && numero % 5 == 0) {
            System.out.println("El número no es par pero sí divisible entre 5");
        } else {
            System.out.println("El número no es par ni divisible entre 5");
        }

    }
    
}

