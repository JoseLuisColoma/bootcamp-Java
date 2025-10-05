/*
Ejercicio 28
Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.
Ejemplo 1:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): papel
Empate
Ejemplo 2:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 2
Ejemplo 3:
Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 1
 */

import java.util.Scanner;

public class Ej028_2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== JUEGO DE PIEDRA, PAPEL O TIJERA ==========");
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = sc.nextLine().toLowerCase();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = sc.nextLine().toLowerCase();

        // Validación de jugadas
        boolean jugadaValida1 = jugador1.equals("piedra") || jugador1.equals("papel") || jugador1.equals("tijera");
        boolean jugadaValida2 = jugador2.equals("piedra") || jugador2.equals("papel") || jugador2.equals("tijera");

        if (!jugadaValida1 || !jugadaValida2) {
            System.out.println("Error: una de las jugadas no es válida. Usa piedra, papel o tijera.");
        } else if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if (
                (jugador1.equals("piedra") && jugador2.equals("tijera")) ||
                        (jugador1.equals("papel") && jugador2.equals("piedra")) ||
                        (jugador1.equals("tijera") && jugador2.equals("papel"))
        ) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }

        sc.close();
    }
}

