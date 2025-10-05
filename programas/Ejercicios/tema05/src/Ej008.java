/*
Ejercicio 8
Muestra la tabla de multiplicar de un número introducido por teclado.
 */

import java.util.Scanner;

public class Ej008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para obtener su tabla de multiplicar: ");
        int numero = sc.nextInt();
        System.out.println("TABLA DEL " + numero);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "x" + numero + " = " + i*numero);
        }
        sc.close();
    }
}
