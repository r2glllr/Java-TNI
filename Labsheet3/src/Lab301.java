import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int num = scanner.nextInt();
        if (num == 0)
            System.out.println("This is zero number.");
        else if ((num % 2) == 0) {
            System.out.println("This number is Even and Positive number.");
        }
        else {
            System.out.println("This number is Odd and Negative number.");
        }


    }
}