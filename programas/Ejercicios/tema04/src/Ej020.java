/*
Ejercicio 20
Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 */

import java.util.Scanner;

public class Ej020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero por teclado: ");
        int numero = sc.nextInt();
        int digitos = 0;

        if (numero < 0) {
            numero = -numero;
        }

        if (numero >= 100000) {
            System.out.println("El número no puede ser de más de 5 cifras");
            System.out.println("Inténtalo de nuevo");
        } else if (numero < 10) {
            System.out.println("el número solo tiene una cifra. Es capicúa por definición.");
        } else if (numero < 100) {
            int digito1 = numero / 10;
            int digito2 = numero % 10;
            if (digito1 == digito2) {
                System.out.println("El número es capicúa.");
            } else System.out.println("El número NO es capicúa.");
        } else if (numero < 1000) {
            int digito1 = numero / 100;
            int digito3 = numero % 10;
            if (digito1 == digito3) {
                System.out.println("El número es capicúa.");
            } else System.out.println("El número NO es capicúa.");
        } else if (numero < 10000) {
            int digito1 = numero / 1000;
            int digito4 = numero % 10;
            int digito2 = (numero / 10) % 10;
            int digito3 = (numero / 100) % 10;;
            if ((digito1 == digito4) && (digito2 == digito3)) {
                System.out.println("El número es capicúa.");
            } else System.out.println("El número NO es capicúa.");
        } else if (numero < 100000) {
            int decenasDeMillar = numero / 10000;
            int millares = (numero / 1000) % 10;
            int centenas = (numero / 100) % 10;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;

            if (decenasDeMillar == unidades && millares == decenas) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número NO es capicúa.");
            }
        }

    }

}

