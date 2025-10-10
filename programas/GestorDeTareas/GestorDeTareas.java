import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeTareas {

    private List<Tarea> tareas;
    private Tarea ultimaTarea;
    private final Scanner sc;

    public GestorDeTareas() {
        this.tareas = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    // ------------------- MÉTODOS PRINCIPALES -------------------

    public void iniciar() {
        int opcion;
        final int SALIR = 4;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != SALIR);
    }

    private void mostrarMenu() {
        System.out.println("\n| ------------------------------ |");
        System.out.println("| ====== GESTOR DE TAREAS ====== |");
        System.out.println("| ------------------------------ |");
        System.out.println("| 1.- Insertar nueva tarea       |");
        System.out.println("| 2.- Listar tareas              |");
        System.out.println("| 3.- Mostrar última tarea       |");
        System.out.println("| 4.- Salir                      |");
        System.out.println("| ------------------------------ |");
    }

    private int leerOpcion() {
        System.out.print("\n> Elige una opción (1-4): ");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido.");
            sc.nextLine();
        }
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> agregarTarea();
            case 2 -> listarTareas();
            case 3 -> mostrarUltimaTarea();
            case 4 -> salirPrograma();
            default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
        }
    }

    private void agregarTarea() {
        System.out.print("Nombre de la tarea: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Prioridad (1-5): ");
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. La prioridad debe ser un número.");
            sc.nextLine();
        }
        int prioridad = sc.nextInt();
        sc.nextLine();

        if (prioridad < 1 || prioridad > 5) {
            System.out.println("Prioridad inválida (debe estar entre 1 y 5).");
            return;
        }

        Tarea nueva = new Tarea(nombre, prioridad);
        tareas.add(nueva);
        ultimaTarea = nueva;

        System.out.println("Tarea añadida correctamente: " + nueva);
    }

    private void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas todavía.");
            return;
        }

        System.out.println("\n========== LISTA DE TAREAS ==========");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, tareas.get(i));
        }

        double media = tareas.stream().mapToInt(Tarea::getPrioridad).average().orElse(0);
        System.out.printf("Media de prioridades: %.2f%n", media);
    }

    private void mostrarUltimaTarea() {
        if (ultimaTarea == null) {
            System.out.println("No se ha agregado ninguna tarea aún.");
        } else {
            System.out.println("Última tarea registrada:");
            ultimaTarea.ejecutar();
        }
    }

    private void salirPrograma() {
        System.out.print("\nSaliendo del programa");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            System.out.println("\nProceso interrumpido.");
        }
        System.out.println("\nGracias por usar el Gestor de Tareas.");
    }
}