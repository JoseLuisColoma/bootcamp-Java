/*
Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 */

/* Utilizando variable temporal y operador ternario (versión compacta) */

import java.util.Scanner;

public class Ej012_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuántos términos de Fibonacci mostrar: ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("\nSerie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + (i < n - 1 ? ", " : ""));
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        sc.close();
    }
}
