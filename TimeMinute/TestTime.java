package TimeMinute;

import java.util.Scanner;

public class TestTime {

    Scanner sc = new Scanner(System.in);
    int hour, minute;

    public TestTime() {
        System.out.print("Enter the hour :");
        hour = sc.nextInt();

        System.out.print("Enter the minute :");
        minute = sc.nextInt();

    }

    public TestTime(int h, int m) {
        hour = h;
        minute = m;
    }

    @Override
    public String toString() {
        if (hour < 0 || hour > 23) {
            return ("Worng Enter the Hour :" + hour);
        }

        if (minute < 0 || minute > 59) {
            return ("Worng Enter the minute :" + minute);
        }

        if (hour == 12) {
            return String.format("Correct Timing : %02d:%02d PM", hour, minute);
        }
        if (hour > 12) {
            return String.format("Correct Timing : %02d:%02d PM", hour - 12, minute);
        } else {
            return String.format("Correct Timing : %02d:%02d AM", hour, minute);
        }
    }

    public static void main(String[] args) {

        Time t = new Time();
        System.out.print(t);

    }

}
