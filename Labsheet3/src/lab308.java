import java.util.Scanner;

public class lab308 {
    public static void main(String[] args) {
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int Evencount = 0;
        int Oddcount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number to input: ");
        number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scan.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
            if (num % 2 == 0) {
                Evencount++;
            } else {
                Oddcount++;

            }


        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even count = " + Evencount);
        System.out.println("Odd count = " + Oddcount);

    }
}
