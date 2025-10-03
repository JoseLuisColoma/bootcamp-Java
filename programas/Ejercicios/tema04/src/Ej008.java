/*
Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín
(insuficiente, suficiente, bien, notable o sobresaliente).
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final int NUM_NOTAS = 3;

        System.out.print("Introduce la 1ª nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce la 2ª nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Introduce la 3ª nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / NUM_NOTAS;
        String notaBoletin;

        if (media < 5) {
            notaBoletin = "Insuficiente";
        } else if (media < 6) {
            notaBoletin = "Suficiente";
        } else if (media < 7) {
            notaBoletin = "Bien";
        } else if (media < 9) {
            notaBoletin = "Notable";
        } else {
            notaBoletin = "Sobresaliente";
        }

        System.out.println("Nota Media: " + df.format(media));
        System.out.println("Nota en el Boletín: " + notaBoletin);
    }
}


