package CarbookingProject;

import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);
    String name, mobile, address;
    int age;

    public Person() {

        System.out.print("Enter the Name : ");
        name = sc.nextLine();
        while (true)
    try {
            System.out.print("Enter the Mobile : ");
            mobile = sc.nextLine();

            if (!mobile.matches("\\d{10}")) {
                throw new Exception("Error Mobile Number!");
            }
            break;
        } catch (Exception ex) {
            System.out.println(ex);

        }

        System.out.print("Enter the Address : ");
        address = sc.nextLine();

        while (true)
            try {
            System.out.print("Enter the Age : ");
            age = sc.nextInt();

            if (age < 18 || age > 60) {
                throw new Exception("Age Error ");
            }
            break;
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    public Person(String n, String m, String ad, String g, int a) {
        name = n;
        mobile = m;
        address = ad;
        age = a;
    }

    public String toString() {
        return String.format("name=%s, mobile=%s, address=%s, Age=%s, ",
                name, mobile, address, age);
    }

    public static void main(String[] args) {

//    Person p = new Person("Roshan", "8188935865", "Mirzapur", 21);
//    System.out.println(p);
        Person p1 = new Person();
        System.out.println(p1);
    }

}
