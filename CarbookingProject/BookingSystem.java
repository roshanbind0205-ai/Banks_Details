package CarbookingProject;

import java.util.*;

public class BookingSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        CarManager manager = new CarManager();

        while (true) {

            System.out.println("\n\n=== Car Booking Menu ===");
            System.out.println("0. Exit");
            System.out.println("1. Booking");
            System.out.println("2. Car Entry");
            System.out.println("3. All Cars");
            System.out.println("4. Car Entry Delete");
            System.out.println("5. All Booking");

            System.out.print("Choose: ");
            int option = Integer.parseInt(s.nextLine());

            switch (option) {

                case 0:
                    System.out.println("Saving and Exiting...");
                    return;

                case 1:
                    System.out.println("Booking");
                    new Booking().stratBooking();
                    break;

                case 2:
                    manager.addCar();
                    break;

                case 3:
                    manager.listCars();
                    break;

                case 4:
                    System.out.print("Car ID to delete: ");
                    int id = Integer.parseInt(s.nextLine());
                    manager.deleteCar(id);
                    break;

                case 5:

                    System.out.print("All Booking");
                    BookingStorage.printAllBookings();
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
