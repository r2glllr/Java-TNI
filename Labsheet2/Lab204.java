import javax.swing.*;
import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input hour :");
        int hour_ = scan.nextInt();

        System.out.print("Input minute : ");
        int minute_ = scan.nextInt();
        int hours = hour_*60;
        int total = hours+minute_;
        System.out.println(
                "total time is "+total+" minutes"  );
    }
}
