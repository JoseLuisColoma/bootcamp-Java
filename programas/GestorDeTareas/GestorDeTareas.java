import java.util.Scanner;

public class GestorDeTareas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int totalPriority = 0;

        System.out.println("******************************");
        System.out.println("   TASK MANAGER APPLICATION   ");
        System.out.println("******************************");
        System.out.println("============ MENU ============");
        System.out.println("1.- Insert new Task");
        System.out.println("2.- List Tasks");
        System.out.println("3.- Exit");
        System.out.println("==============================");
        System.out.println();
        System.out.print(">>> Choose an option (1-3): ");

        int option = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (option >= 1 && option <= 3) {
            if (option == 1) {
                System.out.print("Task name: ");
                String taskName = sc.nextLine();

                System.out.print("Task Priority (1 to 5): ");
                int taskPriority = sc.nextInt();

                boolean isValidPriority = taskPriority >= 1 && taskPriority <= 5;
                System.out.println("Priority is OK? " + isValidPriority);

                totalPriority += taskPriority;

                System.out.println("Task inserted: " + taskName + " | Priority: " + taskPriority);
                System.out.println("Total of Priorities: " + totalPriority);

            } else if (option == 2) {
                System.out.println("List Tasks TO DO (placeholder)");
            } else {
                System.out.println("Bye!");
            }
        } else {
            System.out.println("Invalid Option");
        }

        sc.close();
    }
}