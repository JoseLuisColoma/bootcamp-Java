import java.util.Scanner;

public class Ej008_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para obtener su tabla de multiplicar: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Introduce un número entero: ");
            sc.next(); // descarta token inválido
        }
        int numero = sc.nextInt();

        System.out.print("¿Hasta qué multiplicador quieres (por defecto 10)? ");
        int hasta;
        if (sc.hasNextInt()) {
            hasta = sc.nextInt();
            if (hasta <= 0) hasta = 10; // fallback razonable
        } else {
            sc.next(); // descartar si no es int
            hasta = 10;
        }

        System.out.println("\nTABLA DEL " + numero);
        for (int i = 1; i <= hasta; i++) {
            System.out.printf("%2d x %d = %d%n", i, numero, i * numero);
        }

        sc.close();
    }
}
