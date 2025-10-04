/*
Ejercicio 17
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado
 */

import java.util.Scanner;

public class Ej017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero por teclado: ");
        String numero = sc.nextLine();

        System.out.println(numero.length());

        System.out.println(numero.substring(numero.length()-1));

        sc.close();
    }
    
}

