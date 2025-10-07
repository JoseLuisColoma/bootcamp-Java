/*
Ejercicio 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */

import java.util.Scanner;

public class Ej017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser un entero positivo.");
            sc.close();
            return;
        }

        int total = 0;

        for (int i = numero + 1; i <= numero + 100; i++) {
            total += i;
        }

        System.out.println("\nSuma de los 100 números siguientes a " + numero + ":");
        System.out.println("Resultado total = " + total);

        sc.close();
    }
}

