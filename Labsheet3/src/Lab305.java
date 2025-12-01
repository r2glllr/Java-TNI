import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Fist number : ");
        int numfirst = scanner.nextInt();
        Scanner scanx = new Scanner(System.in);
        System.out.print("Enter the second number : ");
        int numsecond = scanx.nextInt();

        for (int i =numfirst; i <= numsecond; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

