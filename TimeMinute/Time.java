package TimeMinute;
import java.util.Scanner;

public class Time {

    int hour, minute;
    Scanner sc = new Scanner(System.in);

    public Time() 
    {
        System.out.print("Enter the Hour :");
        hour = sc.nextInt();

        System.out.print("Enter the Minute :");
        minute = sc.nextInt();

    }

    public Time(int h, int m) 
    {
        hour = h;
        minute = m;
    }

    @Override
    public String toString() 
    {
       
        if (hour < 0 || hour > 23) 
        {
           return ("Wrong Enter the Hour : " + hour);
            
        }

        if (minute < 0 || minute > 59) 
        {
           return ("Wrong Enter the Minute : " + minute);
            
        }

        
        if (hour == 0) 
        { 
            return String.format("Correct Timing : 12:%02d AM", minute);
        } 
        
        if (hour == 12) 
        { 
            return String.format("Correct Timing : %02d:%02d PM", hour, minute);
        } 
        
        if (hour > 12) 
        { 
            return String.format("Correct Timing : %02d:%02d PM", hour - 12, minute);
        } 
        
        else 
        {
            return String.format("Correct Timing : %02d:%02d AM", hour, minute);
        }
        
    }
    

    public static void main(String[] args) {

        Time t = new Time();
        System.out.print(t);

    }

}