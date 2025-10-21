/*
Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
 */

public class Ej007 {
    public static void main(String[] args) {

        final int PARTIDOS = 14;
        final int APUESTAS = 3;

        // Cabecera
        System.out.println("     QUINIELA DE FUTBOL");
        System.out.println("---------------------------------------");
        System.out.println("Partido  | Apuesta1 Apuesta2 Apuesta3");
        System.out.println("---------------------------------------");

        // Generamos los 14 partidos
        for (int i = 1; i <= PARTIDOS; i++) {
            System.out.printf("%8d |", i);
            for (int j = 1; j <= APUESTAS; j++) {
                System.out.printf("      %s", generarResultado());
            }
            System.out.println();
        }

        // Pleno al 15
        System.out.println("----------------------------------");
        System.out.print("P. al 15 |");
        for (int j = 1; j <= APUESTAS; j++) {
            System.out.printf("      %s", generarResultado());
        }

        System.out.println("\n---------------------------------------");
    }

    public static String generarResultado(){
        int APUESTAS = 3;
        int resultado = (int)(Math.random()*APUESTAS +1);
        return switch (resultado){
            case 1-> "1";
            case 2-> "X";
            default -> "2";
        };
    }

}
