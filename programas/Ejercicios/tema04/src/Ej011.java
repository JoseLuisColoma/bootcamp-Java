/*
Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 */

import java.util.Scanner;

public class Ej011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int SEGUNDOS_DIA = 60*60*24;
        final int SEGUNDOS_HORA = 60*60;
        final int SEGUNDOS_MINUTO = 60;

        System.out.println("Introduce la hora (0-23): ");
        int horasEntrada = sc.nextInt();
        System.out.println("Introduce los minutos (0-59): ");
        int minutosEntrada = sc.nextInt();

        int segundosPorHoraEntrada = horasEntrada * SEGUNDOS_HORA;
        int segundosPorMinutoEntrada = minutosEntrada * SEGUNDOS_MINUTO;
        int segundosTotalesEntrada = segundosPorHoraEntrada + segundosPorMinutoEntrada;

        int segundosHastaMedianoche = SEGUNDOS_DIA - segundosTotalesEntrada;

        // Ajuste: si estamos justo a medianoche, no quedan 86400s sino 0
        if (segundosHastaMedianoche == SEGUNDOS_DIA) {
            segundosHastaMedianoche = 0;
        }

        System.out.println("Quedan " + segundosHastaMedianoche + " segundos hasta la medianoche");
    }
}

