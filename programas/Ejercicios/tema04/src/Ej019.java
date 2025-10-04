/*
Ejercicio 19
Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */

import java.util.Scanner;

public class Ej019 {
    static void main(String[] args) {
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
            digitos = 1;
        } else if (numero < 100) {
            digitos = 2;
        } else if (numero < 1000) {
            digitos = 3;
        } else if (numero < 10000) {
            digitos = 4;
        } else if (numero < 100000) {
            digitos = 5;
        }

        if (numero < 100000) {
            System.out.println("La cantidad de cifras que tiene el número " + numero + " es: " + digitos);
        }

    }

}

