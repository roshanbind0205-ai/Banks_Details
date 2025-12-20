package CarbookingProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking implements Serializable {

    int BookingId, Totalamount;
    String date, cartype;

    private static int nextId = 1;

    public Booking() {
    }

    public Booking(int BookingId, int Totalamount, String date, String cartype) {
        this.BookingId = BookingId;
        this.Totalamount = Totalamount;
        this.date = date;
        this.cartype = cartype;

    }

    public void stratBooking() {

        Scanner sc = new Scanner(System.in);
        this.BookingId = (nextId++);

        ArrayList<Car> cars = CarStorage.loadCars();

        if (cars.isEmpty()) {
            System.out.println("Not car avaible");
            return;
        }

        for (Car c : cars) {

            System.out.println(c.getId() + " : Company_Name : " + c.company + ", Car_Model : "
                    + "" + c.model + "," + " Car_Number : " + c.carnumber);
        }

        System.out.println("Select the Car Id :");
        int cid = Integer.parseInt(sc.nextLine());

        Car selected = null;
        for (Car c : cars) {
            if (c.getId() == cid) {
                selected = c;
                break;
            }
        }

        if (selected == null) {
            System.out.print("Invalid Car Id");
        }
        System.out.println("Enter the Date :");
        date = sc.nextLine();

//        System.out.println("Enter the BookingId :");
//        BookingId = sc.nextInt();
        System.out.println("Enter the Totalamount :");
        Totalamount = sc.nextInt();

        cartype = selected.company;
        ArrayList<Booking> list = BookingStorage.loadBookings();
        list.add(this);
        BookingStorage.saveBookings(list);

        System.out.println("\nBooking saved successfully!");

    }

    @Override
    public String toString() {
        return String.format("BookingId=%s,  date=%s, cartype=%S, Tatalamount=%s", BookingId, date, cartype, Totalamount);
    }

}
