/*
Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.
 */

/*
Aries -> 21 de marzo – 19 de abril
Tauro -> 20 de abril – 20 de mayo
Géminis -> 21 de mayo – 20 de junio
Cáncer -> 21 de junio – 22 de julio
Leo -> 23 de julio – 22 de agosto
Virgo -> 23 de agosto – 22 de septiembre
Libra ->23 de septiembre – 22 de octubre
Escorpio -> 23 de octubre – 21 de noviembre
Sagitario -> 22 de noviembre – 21 de diciembre
Capricornio -> 22 de diciembre – 19 de enero
Acuario -> 20 de enero – 18 de febrero
Piscis -> 19 de febrero – 20 de marzo
*/

import java.util.Scanner;

public class Ej010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        String horoscopo = "";

        // Aries -> 21 de marzo – 19 de abril
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            horoscopo = "Aries";
        // Tauro -> 20 de abril – 20 de mayo
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            horoscopo = "Tauro";
        // Géminis -> 21 de mayo – 20 de junio
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            horoscopo = "Géminis";
        // Cáncer -> 21 de junio – 22 de julio
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            horoscopo = "Cáncer";
        //Leo -> 23 de julio – 22 de agosto
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            horoscopo = "Leo";
        // Virgo -> 23 de agosto – 22 de septiembre
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            horoscopo = "Virgo";
        // Libra ->23 de septiembre – 22 de octubre
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            horoscopo = "Libra";
        // Escorpio -> 23 de octubre – 21 de noviembre
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            horoscopo = "Escorpio";
        // Sagitario -> 22 de noviembre – 21 de diciembre
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            horoscopo = "Sagitario";
        // Capricornio -> 22 de diciembre – 19 de enero
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            horoscopo = "Capricornio";
        // Acuario -> 20 de enero – 18 de febrero
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            horoscopo = "Acuario";
        //
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            horoscopo = "Piscis";
        } else {
            horoscopo = "Fecha inválida";
        }

        System.out.println("Tu horóscopo es: " + horoscopo);
    }
}
