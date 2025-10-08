/*
Ejercicio 18
Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */

import java.util.Scanner;

import java.util.Scanner;

public class Ej018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales. Prueba de nuevo.");
            sc.close();
            return;
        }

        // Intercambiar si el primero es mayor
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("\nNúmeros comprendidos entre " + numero1 + " y " + numero2 + " (incrementando de 7 en 7):");

        boolean primero = true; // para controlar la primera coma

        for (int i = numero1 + 7; i < numero2; i += 7) {
            if (!primero) {
                System.out.print(", ");
            }
            System.out.print(i);
            primero = false;
        }

        System.out.println(); // salto de línea final
        sc.close();
    }
}

