/*
Ejercicio 19
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */

import java.util.Scanner;

public class Ej019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();

        System.out.print("Introduce el caracter de la pirámide: ");
        String simbolo = sc.next();

        for (int i = 1; i <= altura ; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir caracteres (crecen)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(simbolo);
            }

            // 3Salto de línea
            System.out.println();
        }

        sc.close();

    }

}
