//package TodoApp_Project;
//
//import java.util.Scanner;
//
//public class TodoApp {
//
//    public static void main(String[] args) {
//
//        TodoManager manager = new TodoManager();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\n=== TODO MENU ===");
//            System.out.println("1. Add Task");
//            System.out.println("2. List Tasks");
//            System.out.println("3. Mark Completed");
//            System.out.println("4. Delete Task");
//            System.out.println("5. Exit");
//            System.out.print("Choose: ");
//
//            int choice = sc.nextInt();
//            sc.nextLine();
//
//            switch (choice) {
//                case 1 -> {
//                    System.out.print("Enter task title: ");
//                    String title = sc.nextLine();
//                    manager.addTask(title);
//                }
//
//                case 2 -> manager.listTasks();
//
//                case 3 -> {
//                    System.out.print("Task ID to mark complete: ");
//                    int id1 = sc.nextInt();
//                    manager.markCompleted(id1);
//                }
//
//                case 4 -> {
//                    System.out.print("Task ID to delete: ");
//                    int id2 = sc.nextInt();
//                    manager.deleteTask(id2);
//                }
//
//                case 5 -> {
//                    System.out.println("Goodbye!");
//                    return;
//                }
//
//                default -> System.out.println("Invalid choice.");
//            }
//        }
//    }
//}
