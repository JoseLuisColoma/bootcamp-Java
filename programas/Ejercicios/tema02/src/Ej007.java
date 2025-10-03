/* Ejercicio 7
Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible?
*/

public class Ej007 {
    public static void main(String[] args) {
        char c = 'a';
        String cadena = "mapola";

        System.out.println(c + cadena); // imprime "amapola"
        System.out.println(c + c); // imprime 194 suma nº ASCII correspodiente al c=97
        System.out.println("" + c + c); // imprime cc
    }
}
