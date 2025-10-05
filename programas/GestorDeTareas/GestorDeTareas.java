import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeTareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int FINAL_DEL_PROGRAMA = 3;

        int opcion;
        int totalPrioridad = 0;

        List<String> tareas = new ArrayList<>();
        List<Integer> listaPrioridades = new ArrayList<>();

        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
            totalPrioridad = ejecutarOpcion(opcion, sc, totalPrioridad, tareas, listaPrioridades);
        } while (opcion != FINAL_DEL_PROGRAMA);

        sc.close();
    }

    // ------------------- MÉTODOS PRINCIPALES -------------------

    public static void mostrarMenu() {
        System.out.println("\n| ------------------------------ |");
        System.out.println("| ====== GESTOR DE TAREAS ====== |");
        System.out.println("| ------------------------------ |");
        System.out.println("|              MENÚ              |");
        System.out.println("| 1.- Insertar nueva tarea       |");
        System.out.println("| 2.- Listar tareas              |");
        System.out.println("| 3.- Salir                      |");
        System.out.println("| ------------------------------ |");
    }

    public static int leerOpcion(Scanner sc) {
        System.out.print("\n> Elige una opción (1-3): ");

        if (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido.");
            sc.nextLine();
            return 0;
        }

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return opcion;
    }

    public static int ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad,
                                     List<String> tareas, List<Integer> listaPrioridades) {

        switch (opcion) {
            case 1 -> totalPrioridad = agregarTarea(sc, totalPrioridad, tareas, listaPrioridades);
            case 2 -> listarTareas(tareas, listaPrioridades, totalPrioridad);
            case 3 -> salirPrograma();
            default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
        }

        return totalPrioridad;
    }

    public static int agregarTarea(Scanner sc, int totalPrioridad,
                                   List<String> tareas, List<Integer> listaPrioridades) {

        System.out.print("Nombre de la tarea: ");
        String nombreTarea = sc.nextLine().trim();

        System.out.print("Prioridad de la tarea (1-5): ");
        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. La prioridad debe ser un número.");
            sc.nextLine();
            return totalPrioridad;
        }

        int prioridadTarea = sc.nextInt();
        sc.nextLine();

        if (prioridadTarea >= 1 && prioridadTarea <= 5) {
            tareas.add(nombreTarea);
            listaPrioridades.add(prioridadTarea);
            totalPrioridad += prioridadTarea;
            System.out.printf("Tarea añadida: '%s' | Prioridad: %d%n", nombreTarea, prioridadTarea);
            System.out.println("Suma total de prioridades: " + totalPrioridad);
        } else {
            System.out.println("Prioridad inválida (debe estar entre 1 y 5).");
        }

        return totalPrioridad;
    }

    public static void listarTareas(List<String> tareas, List<Integer> listaPrioridades, int totalPrioridad) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas todavía.");
        } else {
            System.out.println("| ------------------------------ |");
            System.out.println("|        LISTA DE TAREAS         |");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.printf("  %d. %s (Prioridad: %d)%n",
                        i + 1, tareas.get(i), listaPrioridades.get(i));
            }
            System.out.println("| ------------------------------ |");
            double mediaPrioridades = (double) totalPrioridad / tareas.size();
            System.out.printf("Media de prioridades: %.2f%n", mediaPrioridades);
        }
    }

    public static void salirPrograma() {
        System.out.print("\nSaliendo del programa ");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(600);
                System.out.print(".");
            }
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("\nProceso interrumpido.");
        }
        System.out.println("\nGracias por usar el Gestor de Tareas.");
    }
}
