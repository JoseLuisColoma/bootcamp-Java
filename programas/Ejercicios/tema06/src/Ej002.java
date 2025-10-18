/*
Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
 */

public class Ej002 {
    static void main(String[] args) {
        System.out.println("Baraja Francesa");
        final int NUM_CARTAS_PALO = 13;
        final int NUM_PALOS = 4;
        int input_palo = (int) (Math.random() * NUM_PALOS + 1);
        int input_carta = (int) (Math.random() * NUM_CARTAS_PALO + 1);
        String palo = "";
        String carta = "";

        switch (input_carta) {
            case 1:
                carta = "as";
                break;
            case 2:
                carta = "dos";
                break;
            case 3:
                carta = "tres";
                break;
            case 4:
                carta = "cuatro";
                break;
            case 5:
                carta = "cinco";
                break;
            case 6:
                carta = "seis";
                break;
            case 7:
                carta = "siete";
                break;
            case 8:
                carta = "ocho";
                break;
            case 9:
                carta = "nueve";
                break;
            case 10:
                carta = "diez";
                break;
            case 11:
                carta = "jota";
                break;
            case 12:
                carta = "dama";
                break;
            case 13:
                carta = "rey";
                break;
            default:
                System.out.println("Esta carta no existe en la baraja");
        }

        switch (input_palo) {
            case 1:
                palo = "picas";
                break;
            case 2:
                palo = "tréboles";
                break;
            case 3:
                palo = "diamantes";
                break;
            case 4:
                palo = "corazones";
                break;
            default:
                System.out.println("Ese palo no existe en la baraja");
        }

        System.out.println(carta + " de " + palo);

    }
}
