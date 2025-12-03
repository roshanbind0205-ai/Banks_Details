package Banks_Details;

public class Person {

    String name, mobile, address;

    public Person(String n, String m, String a) {
        name = n;
        mobile = m;
        address = a;
    }

    public String toString() {
        return String.format("name=%s, mobile=%s, address=%s", name, mobile, address);
    }

    public static void main(String[] agrs) {
        Person p1 = new Person("Roshan", "8188935865", "Kachhwa");
        System.out.println(p1);
    }
}
