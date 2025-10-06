/*
Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 */

import java.util.Scanner;

public class Ej010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de la media de números");
        System.out.println("Introduce una cantidad de número para hacer su media (nº negativo para terminar)");
        double numero;
        double numeradorMedia = 0;
        int cantidadNumeros = 0;

        do {
            System.out.println("número: ");
            numero = sc.nextDouble();
            if (numero > 0){
                numeradorMedia += numero;
                cantidadNumeros +=1;
            }
        } while (numero >= 0);

        if (cantidadNumeros > 0) {
            double media = numeradorMedia / cantidadNumeros;
            System.out.printf("La media de los %d números introducidos es: %.2f%n", cantidadNumeros, media);
        } else {
            System.out.println("No se han introducido números positivos.");
        }

        sc.close();
    }
}