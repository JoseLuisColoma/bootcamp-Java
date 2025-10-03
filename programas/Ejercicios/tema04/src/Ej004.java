/*
Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros
Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros
Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej004 {
    public static void main(String[] args) {

        final int HORAS_MINIMAS_SEMANA = 40;
        final int EUROS_POR_HORA = 12;
        final int EUROS_POR_HORA_EXTRA = 16;
        double salarioSemanal = 0;
        double horasExtra = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Dime el trabajador: ");
        String trabajador = sc.nextLine();

        System.out.println("Dime las horas trabajadas por durante la semana: ");
        double horasSemana = sc.nextDouble();

        if (horasSemana < HORAS_MINIMAS_SEMANA){
            salarioSemanal = horasSemana * EUROS_POR_HORA;
        } else{
            horasExtra = horasSemana - HORAS_MINIMAS_SEMANA;
            salarioSemanal = (HORAS_MINIMAS_SEMANA * EUROS_POR_HORA) + (horasExtra * EUROS_POR_HORA_EXTRA);
        }

        System.out.println("Trabajador: " + trabajador);
        System.out.println("Horas Extra realizadas: " + horasExtra + " horas");
        System.out.println("Salario semanal: " + df.format(salarioSemanal) + "€");

    }
}

