import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GestorDeTareas {

    private ArrayList<Tarea> listaTareas;
    private HashMap<String, Tarea> mapaTareas;
    private Scanner sc;
    private Tarea ultimaTarea;
    private static final String ARCHIVO_TAREAS = "tareas.txt";

    public GestorDeTareas() {
        listaTareas = new ArrayList<>();
        mapaTareas = new HashMap<>();
        sc = new Scanner(System.in);
        cargarTareasDesdeArchivo();
    }

    // ------------------- MÉTODOS PRINCIPALES -------------------

    public void iniciar() {
        int opcion;
        final int SALIR = 0;

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
        System.out.println("| 1. Añadir nueva tarea          |");
        System.out.println("| 2. Listar todas las tareas     |");
        System.out.println("| 3. Buscar tarea por ID         |");
        System.out.println("| 4. Eliminar tarea              |");
        System.out.println("| 5. Mostrar última tarea        |");
        System.out.println("| 0. Salir                       |");
        System.out.println("| ------------------------------ |");
    }

    private int leerOpcion() {
        System.out.print("\n> Elige una opción (0-5): ");
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
            case 3 -> buscarTareaPorId();
            case 4 -> eliminarTarea();
            case 5 -> mostrarUltimaTarea();
            case 0 -> salirPrograma();
            default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
        }
    }

    private void agregarTarea() {
        System.out.print("ID de la tarea: ");
        String id = sc.nextLine().trim();

        if (mapaTareas.containsKey(id)) {
            System.out.println("Ya existe una tarea con ese ID.");
            return;
        }

        System.out.print("Nombre de la tarea: ");
        String nombre = sc.nextLine().trim(); // ✅ faltaba esta línea

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

        Tarea nueva = new Tarea(id, nombre, prioridad);
        listaTareas.add(nueva);
        mapaTareas.put(id, nueva);
        ultimaTarea = nueva; // ✅ guardamos la última tarea

        System.out.println("Tarea añadida correctamente: " + nueva);
    }

    private void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas todavía.");
            return;
        }

        System.out.println("\n========== LISTA DE TAREAS ==========");
        for (Tarea t : listaTareas) {
            System.out.println(t);
        }

        double media = listaTareas.stream()
                .mapToInt(Tarea::getPrioridad)
                .average()
                .orElse(0);

        System.out.printf("Media de prioridad: %.2f%n", media);
    }

    private void buscarTareaPorId() {
        System.out.print("Introduce el ID de la tarea: ");
        String id = sc.nextLine().trim();

        Tarea tarea = mapaTareas.get(id);
        if (tarea != null) {
            System.out.println("Tarea encontrada:");
            tarea.ejecutar();
        } else {
            System.out.println("No se encontró ninguna tarea con ese ID.");
        }
    }

    private void eliminarTarea() {
        System.out.print("Introduce el ID de la tarea a eliminar: ");
        String id = sc.nextLine().trim();

        Tarea tarea = mapaTareas.remove(id);
        if (tarea != null) {
            listaTareas.remove(tarea);
            System.out.println("Tarea eliminada correctamente: " + tarea);
        } else {
            System.out.println("No existe una tarea con ese ID.");
        }
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
                Thread.sleep(800);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            System.out.println("\nProceso interrumpido.");
        }
        System.out.println("\nGracias por usar el Gestor de Tareas.");
    }

    // ------------------- PERSISTENCIA -------------------

    private void guardarTareasEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_TAREAS))) {
            for (Tarea t : listaTareas) {
                writer.write(t.getId() + ";" + t.getNombre() + ";" + t.getPrioridad());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las tareas: " + e.getMessage());
        }
    }

    private void cargarTareasDesdeArchivo() {
        File archivo = new File(ARCHIVO_TAREAS);
        if (!archivo.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    String id = partes[0];
                    String nombre = partes[1];
                    int prioridad = Integer.parseInt(partes[2]);
                    Tarea tarea = new Tarea(id, nombre, prioridad);
                    listaTareas.add(tarea);
                    mapaTareas.put(id, tarea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar las tareas: " + e.getMessage());
        }
    }
}
