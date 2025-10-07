/*
Ejercicio 15
Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
 */

import java.util.Scanner;

public class Ej015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base =  sc.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();

        if (exponente<0){
            System.out.println("El exponente debe ser un número entero positivo");
            return;
        }

        for (int i = 1; i <= exponente; i++) {

            System.out.print(base + "" + i + ", ");
        }

    }
}
