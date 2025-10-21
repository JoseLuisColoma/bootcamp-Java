/*
Ejercicio 8
Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */

public class Ej008 {
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
