package Banks_Details;

import java.util.Scanner;

public class BankAccount extends Person {

    int account_no, balance;
    Scanner sc = new Scanner(System.in);

    public BankAccount(String n, String m, String a, int acc, int b) {
        super(n, m, a);
        account_no = acc;
        balance = b;
    }

    public void deposite() {
        System.out.println("Enter the deposite :");
        int amount = sc.nextInt();
        if (amount >= 1) {
            balance = balance + amount;
        } else {
            System.out.println("Not deposite");
        }
    }

    public void withdrow() {
        System.out.println("Enter the withdrow :");
        int amount = sc.nextInt();
        if (amount >= 1) {
            balance = balance - amount;
        } else {
            System.out.println("Not withdrol");
        }
    }

    public String toString() {
        return String.format(" Name=%s, Mobile=%s, Address=%s, account_no=%s, balance=%s", name, mobile, address, account_no, balance);
    }

    public static void main(String[] agrs) {
        BankAccount b1 = new BankAccount("Roshan", " 8188935865", "Varanasi", 284610000, 999);
        System.out.println(b1);
        
        b1.deposite();
        System.out.println(b1);
        
        b1.withdrow();
        System.out.print(b1);
    }

}
