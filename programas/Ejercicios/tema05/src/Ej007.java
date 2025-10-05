/*
Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */

import java.util.Scanner;

public class Ej007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String COMBINACION_CORRECTA = "1234";
        int intentos = 0;
        final int MAX_INTENTOS = 4;

        while (intentos < MAX_INTENTOS) {
            System.out.print("Dame la combinación: ");
            String combinacion = sc.nextLine().trim();
            intentos++;


            if (COMBINACION_CORRECTA.equals(combinacion)) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                sc.close();
                return;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }

        System.out.println("Se han agotado las cuatro oportunidades. Acceso denegado.");
        sc.close();
    }
}

