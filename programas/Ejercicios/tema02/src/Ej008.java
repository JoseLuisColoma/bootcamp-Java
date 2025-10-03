/*Ejercicio 8
Escribe un programa que declare 4 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación
de las anteriores 4 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?*/

public class Ej008 {
    public static void main(String[] args) {
        char c1 = 'J';
        char c2 = 'o';
        char c3 = 's';
        char c4 = 'e';

        System.out.println(c1 + c2 + c3 + c4); // imprime suma de nº ascii
        System.out.println("" + c1 + c2 + c3 + c4); //imprime caracteres
    }
}