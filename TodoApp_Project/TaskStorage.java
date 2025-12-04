package TodoApp_Project;

import java.io.*;
import java.util.ArrayList;

public class TaskStorage {

    private static final String FILE_NAME = "tasks.ser";

    public static void saveTasks(ArrayList<Task> tasks) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (Exception e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    public static ArrayList<Task> loadTasks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Task>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No saved tasks found, starting fresh.");
            return new ArrayList<>();
        }
    }
}
