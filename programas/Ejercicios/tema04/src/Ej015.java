/*
Ejercicio 15
Mejora: pirámides con alineación uniforme en las 4 orientaciones.
*/

import java.util.Scanner;

public class Ej015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== Menu ===============");
        System.out.println("1. pirámide con vértice hacia arriba");
        System.out.println("2. pirámide con vértice hacia abajo");
        System.out.println("3. pirámide con vértice hacia izquierda");
        System.out.println("4. pirámide con vértice hacia derecha");
        System.out.println("====================================");
        System.out.print("\n>>> Elige una opción: ");
        int opcion = sc.nextInt();

        System.out.print("Introduce el carácter para generar la pirámide: ");
        String c = sc.next();

        String resultado = switch(opcion){
            case 1 -> piramideArriba(c);
            case 2 -> piramideAbajo(c);
            case 3 -> piramideIzquierda(c);
            case 4 -> piramideDerecha(c);
            default -> "Opción no válida";
        };

        System.out.println("\n" + resultado);
    }

    // Pirámide hacia arriba
    public static String piramideArriba(String c) {
        return "  " + c + "  \n" +
                " " + c + c + c + " \n" +
                "" + c + c + c + c + c;
    }

    // Pirámide hacia abajo
    public static String piramideAbajo(String c){
        return "" + c + c + c + c + c + "\n" +
                " " + c + c + c + " \n" +
                "  " + c + "  ";
    }

    // Pirámide hacia la izquierda
    public static String piramideIzquierda(String c){
        return "  " + c + "\n" +
                " " + c + c + "\n" +
                "" + c + c + c + "\n" +
                " " + c + c + "\n" +
                "  " + c;
    }

    // Pirámide hacia la derecha
    public static String piramideDerecha(String c){
        return c + "  \n" +
                c + c + " \n" +
                c + c + c + "\n" +
                c + c + " \n" +
                c + "  ";
    }
}
