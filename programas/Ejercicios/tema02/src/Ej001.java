/* Ejercicio 1
Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación*/

public class Ej001 {

    public static void main(String[] args) {
       int x = 144;
       int y = 999;

       int suma = x+y;
       int resta = x-y;
       int producto = x*y;
       double division = (double) x/y;

       System.out.println("num1: " + x + "  |  num2: " + y);
       System.out.println("suma: " + suma);
       System.out.println("resta: " + resta);
       System.out.println("producto: " + producto);
       System.out.println("division: " + division);
    }
}