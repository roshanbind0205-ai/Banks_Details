
package Polymorphims;


public class OverrideDemo {
    
    int add(int a)
    {
        return a;
    }
    
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
      return a+b+c;  
    }
    
    public static void main(String[] args) {
        
        OverrideDemo o= new OverrideDemo();
        
        System.out.println(o.add(1));
        System.out.println(o.add(4,1));
        System.out.println(o.add(20,20,20));
        System.out.println(o.add(1));
        
    }
}
