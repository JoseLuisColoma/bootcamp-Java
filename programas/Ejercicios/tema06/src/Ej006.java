/*
Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.
 */

import java.util.Scanner;

public class Ej006 {
    public static void main(String[] args) {
        int numeroAdivinar = (int) (Math.random() * 101);
        int oportunidades = 7;
        boolean adivinado = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número");
        do {
            System.out.println("Te quedan " + oportunidades + " oportunidad/es");
            System.out.println("introduce el número: ");
            int inputNumero = sc.nextInt();

            // validación de número introducido
            if (inputNumero < 0 || inputNumero > 100) {
                System.out.println("El número debe estar entre 0 y 100.");
                continue;
            }

            if (numeroAdivinar < inputNumero) {
                System.out.println("El número a adividar es MENOR. Prueba otro número.");
            } else if (numeroAdivinar > inputNumero) {
                System.out.println("El número a adividar es MAYOR. Prueba otro número.");

            } else {
                System.out.println("ENHORABUENA! Has adivinado el número");
                adivinado = true;
                break;
            }
            oportunidades--;
        } while (oportunidades != 0);

        if(!adivinado){
            System.out.println("Has perdido. No has adivinado el número en 5 oportunidades");
            System.out.println("El número a adivinar era: " + numeroAdivinar);
        }

        sc.close();
    }
}
