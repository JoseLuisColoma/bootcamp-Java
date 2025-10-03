/*
Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.
1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú
delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho
más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
A continuación se muestran los mensajes que deberá dar el programa según
la puntuación obtenida.
• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
fiel.
• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
vida o en su mente, aunque seguramente será algo sin importancia. No
bajes la guardia.
• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
viviendo un romance con otra persona. Te aconsejamos que indagues un
poco más y averigües que es lo que está pasando por su cabeza.
 */

import java.util.Scanner;

public class Ej016 {
    static void main(String[] args) {

        final String VERDADERO = "verdadero";
        final String FALSO = "falso";
        int puntuacion = 0;

        Scanner sc = new Scanner(System.in);
        String respuesta = "";

        System.out.println("========== TEST DE INFIDELIDAD =========");
        System.out.println("Responde a las preguntas del test con 'verdadero' o 'falso'");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = sc.nextLine().toLowerCase();
        if (respuesta.equals(VERDADERO)) puntuacion += 3;

        System.out.println("\nPuntuación del test: " + puntuacion + " puntos\n");

        if (puntuacion >= 0 && puntuacion < 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente");
        }

        if (puntuacion >= 10 && puntuacion <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su\n" +
                    "vida o en su mente, aunque seguramente será algo sin importancia. No\n" +
                    "bajes la guardia.");
        }

        if (puntuacion > 22 && puntuacion <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar\n" +
                    "viviendo un romance con otra persona. Te aconsejamos que indagues un\n" +
                    "poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}

