/*
Ejercicio 3
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */

public class Ej003 {
    public static void main(String[] args) {
        System.out.println("Baraja española");
        final int NUM_CARTAS_PALO = 10;
        final int NUM_PALOS = 4;
        int input_palo = (int)(Math.random()*NUM_PALOS +1);
        int input_carta = (int)(Math.random()*NUM_CARTAS_PALO +1);
        String palo = "";
        String carta = "";

        switch (input_carta){
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
                carta = "sota";
                break;
            case 9:
                carta = "caballo";
                break;
            case 10:
                carta = "rey";
                break;
            default:
                System.out.println("Esta carta no existe en la baraja española");
        }

        switch (input_palo){
            case 1:
                palo = "bastos";
                break;
            case 2:
                palo = "espadas";
                break;
            case 3:
                palo = "oros";
                break;
            case 4:
                palo = "copas";
                break;
            default:
                System.out.println("Ese palo no existe en la baraja española");
        }

        System.out.println(carta + " de " + palo);
    }
}

