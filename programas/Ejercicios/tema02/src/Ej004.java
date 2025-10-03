/*Ejercicio 4
Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.*/

public class Ej004 {
    public static void main(String[] args) {
        double cantidadEuros = 60.00;
        double conversorPesetaAEuro = 166.386;
        double total = cantidadEuros * conversorPesetaAEuro;

        System.out.println("conversor euros a pesetas:");
        System.out.println(cantidadEuros + "€ son " + total + " pesetas");

    }
}