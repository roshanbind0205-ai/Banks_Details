package CarbookingProject;

import java.io.*;
import java.util.ArrayList;

public class BookingStorage {

    private static final String FILE_NAME = "booking.ser";

    public static void saveBookings(ArrayList<Booking> bookings) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(bookings);
        } catch (Exception e) {
            System.out.println("Error saving bookings: " + e.getMessage());
        }
    }

    public static ArrayList<Booking> loadBookings() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Booking>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void printAllBookings() {

        ArrayList<Booking> list = loadBookings();

        System.out.println("\n=== All Bookings ===");

        if (list.isEmpty()) {
            System.out.println("No bookings found!");
        } else {
            for (Booking b : list) {
                System.out.println(b);
            }
        }
    }
}
