import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("Input some sentence: ");
        String sen = scan.nextLine();

        while (!sen.endsWith(".")) {
            System.out.print("The sentence must end with full stop point: ");
            sen = scan.nextLine();

        }
        System.out.println(sen.replace(" ", "\n"));
    }
}
