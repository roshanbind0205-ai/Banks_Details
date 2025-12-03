package Serializationy;

public class Book {

    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }

    public String toString() {
        return String.format("Bookname=%s, Subject=%s, price=%s", bookname, subject, price);
    }
    public static void main(String[] args) {
        
            
        }
    }

   