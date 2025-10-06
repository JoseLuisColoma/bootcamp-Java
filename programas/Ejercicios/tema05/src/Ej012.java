/*
Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 */

/* Utilizando la Clase StringBuilder para generar cadenas mutables */

import java.util.Scanner;

public class Ej012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder fibonacci = new StringBuilder();

        System.out.print("Introduce el número de elementos a mostrar de la serie de Fibonacci: ");
        int n = sc.nextInt();

        // Validación básica
        if (n <= 0) {
            System.out.println("Debes introducir un número positivo.");
            return;
        }

        int num1 = 0;
        int num2 = 1;

        fibonacci.append(num1);

        if (n > 1) {
            fibonacci.append(", ").append(num2);
        }

        for (int i = 2; i < n; i++) {
            int siguiente = num1 + num2;
            fibonacci.append(", ").append(siguiente);
            num1 = num2;
            num2 = siguiente;
        }

        // Resultado final
        System.out.println("\nSerie de Fibonacci con " + n + " elementos:");
        System.out.println(fibonacci);

        sc.close();
    }
}

