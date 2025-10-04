/*
Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
 */

import java.util.Scanner;

public class Ej018_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero por teclado: ");
        String numero = sc.nextLine();


        if (numero.length()>5){
            System.out.println("El número tiene ser de más de 5 cifras");
            System.out.println("Vuelve a intentarlo");
        } else {
            //System.out.println("este numero vale");
            System.out.println(numero.substring(0,1));
        }

        sc.close();
    }
    
}

