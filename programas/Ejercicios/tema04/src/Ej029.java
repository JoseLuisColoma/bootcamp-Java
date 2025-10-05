/*
Ejercicio 29
Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
bocadillo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar bocadillo, el
programa debe preguntar además si era con jamón o con tortilla; el primero
vale 4.00 € y el segundo 3.75 €. Por último se pregunta por la bebida: zumo o
café a 1.50 y 1.20 respectivamente.
Ejemplo 1:
¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
¿Qué ha tomado de beber? (zumo o café): café
Palmera: 1,40 €
Café: 1,20 €
Total desayuno: 2,60 €
Ejemplo 2:
¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
¿Qué ha tomado de beber? (zumo o café): zumo
Pitufo con tortilla: 1,60 €
Zumo: 1,50 €
Total desayuno: 3,10 €
 */

import java.util.Scanner;

public class Ej029 {
    public static void main(String[] args) {

        final double PRECIO_PALMERA = 1.4;
        final double PRECIO_DONUT = 1.0;
        final double PRECIO_BOC_TORTILLA = 3.5;
        final double PRECIO_BOC_JAMON = 4;
        final double PRECIO_ZUMO = 1.5;
        final double PRECIO_CAFE = 1.2;

        double importeTotal = 0;
        double importeComida = 0;
        double importeBebida = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que calcula el precio de los desayunos");
        System.out.println("¿Qué ha tomado de comer? (palmera, donut o bocadillo): ");
        String comida = sc.nextLine().toLowerCase();
        System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = sc.nextLine().toLowerCase();

        boolean comidaValida = comida.equals("palmera") || comida.equals("donut") || comida.equals("bocadillo");
        boolean bebidaValida = (bebida.equals("zumo") || bebida.equals("cafe") || bebida.equals("café"));

        if (!comidaValida || !bebidaValida){
            System.out.println("Error: uno de los productos se ha introducido incorrectamente");
            return;
        } else {
            switch (comida) {
                case "palmera" -> {
                    importeComida = PRECIO_PALMERA;
                }
                case "donut" -> {
                    importeComida = PRECIO_DONUT;
                }
                case "bocadillo" -> {
                    System.out.println("El bocadillo es de tortilla o jamón?");
                    String tipoBocadillo = sc.nextLine();
                    if (tipoBocadillo.equals("tortilla")) {
                        importeComida = PRECIO_BOC_TORTILLA;
                    } else if (tipoBocadillo.equals("jamón") || tipoBocadillo.equals("jamon")) {
                        importeComida = PRECIO_BOC_JAMON;
                    } else {
                        System.out.println("Error: el bocadillo no existe");
                        return;
                    }
                }
            }

            switch (bebida){
                case "cafe" -> {
                    importeBebida = PRECIO_CAFE;
                }
                case "café" -> {
                    importeBebida = PRECIO_CAFE;
                }
                case "zumo" -> {
                    importeBebida = PRECIO_ZUMO;
                }
                default -> throw new IllegalStateException("Unexpected value: " + bebida);
            }

            importeTotal = importeComida + importeBebida;
        }

        String comidaCapitalizada = comida.substring(0, 1).toUpperCase() + comida.substring(1).toLowerCase();
        String bebidaCapitalizada = bebida.substring(0, 1).toUpperCase() + bebida.substring(1).toLowerCase();

        System.out.println("======== PEDIDO: ========");
        System.out.println("-------------------------");
        System.out.println(comidaCapitalizada + ": " + importeComida + "€");
        System.out.println(bebidaCapitalizada + ": " +  importeBebida + "€");
        System.out.println("TOTAL DESAYUNO: " + importeTotal + "€");
        System.out.println("-------------------------");

    }
    
}

