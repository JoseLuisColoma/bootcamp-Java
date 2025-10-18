import java.util.Arrays;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Generamos 10 números aleatorios del 1 al 6");

        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*6)+1 + " ");
        }

    }
}
