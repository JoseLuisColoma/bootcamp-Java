/*
Ejercicio 2
Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
 */

import java.util.Scanner;

public class Ej002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();
        String saludo = "";

        if (hora >= 6 && hora<=12){
            saludo = "buenos días";
        } else if (hora > 12 && hora < 21) {
            saludo = "buenas tardes";
        } else if((hora >= 21 && hora <=23) || (hora >= 0 && hora < 6)){
            saludo = "buenas noches";
        } else
            saludo = "No es una hora válida";

        System.out.println(saludo);
    }

    
}

