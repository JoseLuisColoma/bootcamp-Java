/*
Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
 */

import java.util.Scanner;

public class Ej018 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero por teclado: ");
        int numero = sc.nextInt();
        int primeraCifra = 0;

        if (numero >= 100000) {
            System.out.println("El número no puede ser de más de 5 cifras");
            System.out.println("Inténtalo de nuevo");
        } else if (numero < 10) {
            primeraCifra = numero;
        } else if (numero < 100) {
            primeraCifra = numero / 10;
        } else if (numero < 1000) {
            primeraCifra = numero / 100;
        } else if (numero < 10000) {
            primeraCifra = numero / 1000;
        } else if (numero < 100000) {
            primeraCifra = numero / 10000;
        }

        if (numero < 100000) {
            System.out.println("La primera cifra del número " + numero + " es: " + primeraCifra);
        }

        sc.close();
    }

}

