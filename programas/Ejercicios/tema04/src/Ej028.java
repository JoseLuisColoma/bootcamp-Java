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

public class Ej028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ========== JUEGO DE PIEDRA, PAPEL O TIJERA =========== ");
        System.out.println("Turno del jugador 1 (piedra, papel o tijera?): ");
        String jugador1 = sc.nextLine().toLowerCase();
        System.out.println("Turno del jugador 2 (piedra, papel o tijera?): ");
        String jugador2 = sc.nextLine().toLowerCase();

        if (jugador1.equals(jugador2)) {
            System.out.println("EMPATE");
        } else if (jugador1.equals("tijera") && jugador2.equals("papel")) {
            System.out.println("GANA EL JUGADOR 1");
        } else if (jugador1.equals("tijera") && jugador2.equals("piedra")) {
            System.out.println("GANA EL JUGADOR 2");
        } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
            System.out.println("GANA EL JUGADOR 1");
        } else if (jugador1.equals("papel") && jugador2.equals("tijera")) {
            System.out.println("GANA EL JUGADOR 2");
        } else if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
            System.out.println("GANA EL JUGADOR 1");
        } else if (jugador1.equals("piedra") && jugador2.equals("papel")) {
            System.out.println("GANA EL JUGADOR 2");
        } else {
            System.out.println("Ha habido un error. Vuelve a pedir piedra papel o tijera");
        }

        sc.close();

    }

}

