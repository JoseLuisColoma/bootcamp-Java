/*
Ejercicio 3
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.
 */

import java.util.Scanner;

public class Ej003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(">>> Introduce el día de la semana (1-7): ");
        int numeroDia = sc.nextInt();

        String diaSemana = switch (numeroDia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "No es un número de día de la semana válido";
        };

        if (numeroDia>=1 && numeroDia<=7){
            System.out.println("El " + numeroDia + "º dia de la semana es el " + diaSemana);
        } else {
            System.out.println(diaSemana);
        }
    }
}