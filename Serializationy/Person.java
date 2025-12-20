
package Serializationy;

import java.util.Scanner;
public class Person {
      
    Scanner sc=new Scanner(System.in);
    String Name,Mobile,Address;
            int Age;
    
    public Person(String name, String mobile, String address, int age){
        
        Name=name;
        Mobile=mobile;
        Address=address;
        Age=age;
        
    }
    
    @Override
    public String toString(){
        return String.format("Name=%s, Mobile=%s, Address=%s, Age=%s,", Name,Mobile,Address,Age);
    }
     
    public static void main(String[] args) {
        Person p=new Person("Roshan", "9792890131","Varansi",21);
        System.out.println(p);
    }
}
