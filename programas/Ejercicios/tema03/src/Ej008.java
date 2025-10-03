/*
Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 */

import java.util.Scanner;

public class Ej008 {
    public static void main(String[] args) {

        final int EUROS_POR_HORA = 12;
        double salarioSemanal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el trabajador: ");
        String trabajador = sc.next();

        System.out.println("Dime las horas trabajadas por durante la semana: ");
        double horasSemana = sc.nextDouble();

        salarioSemanal = horasSemana * EUROS_POR_HORA;
        System.out.println("Trabajador: " + trabajador);
        System.out.println("Salario semanal: " + salarioSemanal +"€");

    }
}
