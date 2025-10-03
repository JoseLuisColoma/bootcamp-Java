/*Ejercicio 5
Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.*/

public class Ej005 {
    public static void main(String[] args) {
        double cantidadPesetas = 1000.00;
        double conversorEurosAPesetas = 1 / 166.386;
        double total = cantidadPesetas * conversorEurosAPesetas;

        System.out.println("conversor euros a pesetas:");
        System.out.println(cantidadPesetas + " pesetas son " + total + "€");

    }
}