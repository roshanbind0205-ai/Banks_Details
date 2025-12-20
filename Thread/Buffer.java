
package Thread;


public class Buffer {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Roshan");
        
//        System.out.println(sb.charAt(2));
//        sb.setCharAt(0, 'p');
//        System.out.println(sb);
//        sb.insert(1, 's');
//        System.out.println(sb);
sb.append("WOrd");
        System.out.println(sb);
        sb.replace(1, 3,"code");
        System.out.println(sb);
        
    }
    
}
