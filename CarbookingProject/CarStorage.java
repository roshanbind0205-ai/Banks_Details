package CarbookingProject;

import java.io.*;
import java.util.ArrayList;

public class CarStorage {

    private static final String FILE_NAME = "cars.ser";

    public static void saveCars(ArrayList<Car> cars) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(cars);
        } catch (Exception e) {
            System.out.println("Error saving cars: " + e.getMessage());
        }
    }

    public static ArrayList<Car> loadCars() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Car>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No saved cars found, starting fresh.");
            return new ArrayList<>();
        }
    }
}
