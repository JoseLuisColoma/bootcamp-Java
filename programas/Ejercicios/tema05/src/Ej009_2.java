/*
Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
*/

/* Solución más eficiente con un WHILE */

import java.util.Scanner;

public class Ej009_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        long numeroInicial = sc.nextLong(); // usamos long para admitir más cifras

        long numero = numeroInicial;
        if (numero < 0) {
            numero = -numero;
        }

        int digitos = 0;

        if (numero == 0) {
            digitos = 1;
        } else {
            while (numero > 0) {
                numero /= 10;
                digitos++;
            }
        }

        System.out.println("El número " + numeroInicial + " tiene " + digitos + " dígito(s).");
        sc.close();
    }
}

