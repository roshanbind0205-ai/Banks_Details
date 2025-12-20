package ExceptionFunction;

/*
try
catch
throw
throws 
finally

 */
public class ExceptionHandling {

    public static void f3() throws Exception {
        System.out.println("F3 Entry");
        throw new Exception("F3 Exception");
//        System.out.println("F3 Exit");
    }

    public static void f2() throws Exception {
        System.out.println("F2 Entry");

        f3();

        System.out.println("F2 Exit");
    }

    public static void f1() throws Exception {
        System.out.println("F1 Entry");
        f2();
        System.out.println("F1 Exit");
    }

    public static void main(String[] args) {
        try {

            System.out.println("Main Entry");
            f1();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Main Exit");
    }
}
