package CarbookingProject;

import java.util.Scanner;
import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;
  
    private  int id;
    String company, model, carnumber;
  
    public Car( int id, String company, String model, String carnumber ) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.carnumber = carnumber;

    }
     public int getId() {
        return id;
    }

    public Car(int id) {
        
        this.id = id;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the company :");
        company = sc.nextLine();

        System.out.print("Enter the model :");
        model = sc.nextLine();

        System.out.print("Enter the carnumber :");
        carnumber = sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("  Id=%s, company=%s, Model=%s, carnumber=%s", id,company, model, carnumber);
    }

}
