/*
Ejercicio 5
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle while.

 */

public class Ej005 {

    public static void main(String[] args) {

        int n=320;
        while (n >= 160){
            System.out.println(n);
            n-=20;
        }
    }
}
