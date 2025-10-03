/*
Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 */

import java.util.Scanner;

public class Ej001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día de la semana: ");
        String diaSemana = sc.nextLine().toLowerCase();

        System.out.print("Introduce la hora (1-6): ");
        int hora = sc.nextInt();

        String asignatura = switch (diaSemana) {
            case "lunes" -> switch (hora) {
                case 1 -> "Java";
                case 2 -> "Sistemas";
                case 3 -> "Bases de Datos";
                default -> "Libre";
            };
            case "martes" -> switch (hora) {
                case 1 -> "Angular";
                case 2 -> "Python";
                case 3 -> "Sistemas";
                default -> "Libre";
            };
            case "miercoles", "miércoles" -> switch (hora) {
                case 1 -> "Python";
                case 2 -> "Java";
                default -> "Libre";
            };
            case "jueves" -> switch (hora) {
                case 1 -> "Django";
                case 2 -> "Angular";
                default -> "Libre";
            };
            case "viernes" -> switch (hora) {
                case 1 -> "Sistemas";
                case 2 -> "Bases de Datos";
                default -> "Libre";
            };
            default -> throw new IllegalStateException("Día no válido: " + diaSemana);
        };

        System.out.println("El " + diaSemana + " a " + hora + "ª toca: " + asignatura);
    }
}


