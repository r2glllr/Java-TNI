import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int Enter_number1 = scan.nextInt();

        System.out.print("Enter number 2 : ");
        int Enter_number2 = scan.nextInt();

        int summation = Enter_number1 + Enter_number2;
        int subtraction = Enter_number1-Enter_number2;
        int multiplication = Enter_number1 * Enter_number2;
        double division = (double) Enter_number1/Enter_number2;
        int modulus = Enter_number1%Enter_number2;

        System.out.println("\nSummation = " +summation +
                "\nSubtraction = "+subtraction + "\nMultiplication = " + multiplication+
                "\nDivision = "+division + "\nModulus = " + modulus);
    }
}
