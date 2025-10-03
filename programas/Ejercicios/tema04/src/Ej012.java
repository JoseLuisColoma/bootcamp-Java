/*
Ejercicio 12
Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida.
*/

import java.util.Scanner;

public class Ej012 {

    public static void main(String[] args) {

        String mensaje1 = "Respuesta correcta!";
        String mensaje2 = "Respuesta incorrecta";
        int puntos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("MINICUESTIONARIO DE PYTHON");
        System.out.println("--------------------------");
        System.out.println("El cuestionario consta de 10 preguntas. Al final obtendrás tu puntuación con las respuestas acertadas");
        System.out.println("Buena suerte!\n");

        System.out.println("PREGUNTA 1");
        System.out.println("¿Qué palabra reservada se usa para definir una función en Python?");
        String pregunta1 = sc.nextLine();
        if (pregunta1.equals("def")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 2");
        System.out.println("¿Cuál es el símbolo para escribir un comentario en Python?");
        String pregunta2 = sc.nextLine();
        if (pregunta2.equals("#")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 3");
        System.out.println("¿Qué tipo de dato devuelve la expresión 3 / 2 en Python?");
        String pregunta3 = sc.nextLine();
        if (pregunta3.equals("float")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 4");
        System.out.println("¿Cuál es la estructura usada para almacenar múltiples elementos ordenados y modificables?");
        String pregunta4 = sc.nextLine();
        if (pregunta4.equals("list")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 5");
        System.out.println("¿Qué función se utiliza para obtener la longitud de una lista en Python?");
        String pregunta5 = sc.nextLine();
        if (pregunta5.equals("len") || pregunta5.equals("len()")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 6");
        System.out.println("¿Con qué símbolo se declara una variable en Python?");
        String pregunta6 = sc.nextLine();
        if (pregunta6.equals("=")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 7");
        System.out.println("¿Qué instrucciones de inicio y fin se usa para manejar excepciones en Python? (2 palabras: palabra1/palabra2):");
        String pregunta7 = sc.nextLine();
        if (pregunta7.equals("try/except")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 8");
        System.out.println("¿Qué operador se usa para comprobar igualdad en Python?");
        String pregunta8 = sc.nextLine();
        if (pregunta8.equals("==")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 9");
        System.out.println("¿Qué palabra clave se usa para importar módulos en Python?");
        String pregunta9 = sc.nextLine();
        if (pregunta9.equals("import")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nPREGUNTA 10");
        System.out.println("¿Con qué 2 símbolos se representa un diccionario en Python?");
        String pregunta10 = sc.nextLine();
        if (pregunta10.equals("{}")) {
            respuestaCorrecta(mensaje1);
            puntos++;
        } else {
            respuestaIncorrecta(mensaje2);
        }

        System.out.println("\nResultado minicuestionario de Python: " + puntos + " puntos");
    }

    // Métodos que usan parámetros
    public static void respuestaCorrecta(String mensaje) {
        System.out.println(mensaje);
    }

    public static void respuestaIncorrecta(String mensaje) {
        System.out.println(mensaje);
    }
}
