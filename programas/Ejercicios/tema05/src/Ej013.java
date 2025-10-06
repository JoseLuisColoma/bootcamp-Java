/*
Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 */

import java.util.Scanner;

public class Ej013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 números enteros");
        int positivos=0;
        int negativos=0;
        int ceros=0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("número " + i + ": " );
            int numero = sc.nextInt();

            if (numero > 0) positivos++;
            else if (numero < 0) negativos ++;
            else ceros++;
        }
        System.out.println("números positivos: " + positivos);
        System.out.println(("números negativos: " + negativos));
        if (ceros > 0){
            System.out.println(("ceros: " + ceros));
        }
        sc.close();
    }
}
