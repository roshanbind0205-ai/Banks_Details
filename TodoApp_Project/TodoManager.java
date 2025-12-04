 
package TodoApp_Project;

import java.util.ArrayList;

public class TodoManager {

    private ArrayList<Task> tasks;
    private int nextId = 1;

    public TodoManager() {
        tasks = TaskStorage.loadTasks();
        if (!tasks.isEmpty()) {
            nextId = tasks.get(tasks.size() - 1).getId() + 1;
        }
    }

    public void addTask(String title) {
        Task t = new Task(nextId++, title);
        tasks.add(t);
        TaskStorage.saveTasks(tasks);
        System.out.println("Task added!");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void markCompleted(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.markCompleted();
                TaskStorage.saveTasks(tasks);
                System.out.println("Task marked as DONE!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
        TaskStorage.saveTasks(tasks);
        System.out.println("Task deleted!");
    }
}

