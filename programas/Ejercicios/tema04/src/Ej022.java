/*
Ejercicio 22
Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
 */

import java.util.Scanner;

public class Ej022 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Constantes
        final int MINUTOS_POR_HORA = 60;
        final int HORAS_POR_DIA = 24;
        final int MINUTOS_POR_DIA = HORAS_POR_DIA * MINUTOS_POR_HORA;
        final int VIERNES_FIN_SEMANA_HORA = 15; // viernes a las 15:00

        // Entrada de datos
        System.out.print("Introduce el día de la semana (lunes, martes, miercoles, jueves, viernes): ");
        String dia = sc.nextLine().toLowerCase();

        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();

        // Cálculo de los minutos transcurridos desde el lunes 00:00
        int diaNumero = 0;

        switch (dia) {
            case "lunes" -> diaNumero = 1;
            case "martes" -> diaNumero = 2;
            case "miercoles", "miércoles" -> diaNumero = 3;
            case "jueves" -> diaNumero = 4;
            case "viernes" -> diaNumero = 5;
            default -> {
                System.out.println("Día no válido o fuera de rango (lunes-viernes).");
                sc.close();
                return;
            }
        }

        int minutosHastaAhora = ((diaNumero - 1) * MINUTOS_POR_DIA) + (hora * MINUTOS_POR_HORA) + minutos;

        int minutosHastaViernes15 = ((5 - 1) * MINUTOS_POR_DIA) + (VIERNES_FIN_SEMANA_HORA * MINUTOS_POR_HORA);

        int minutosRestantes = minutosHastaViernes15 - minutosHastaAhora;

        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana (viernes a las 15:00).");

        sc.close();
    }
}