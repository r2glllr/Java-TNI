import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter word: ");
        String sen = scan.nextLine();
        String all = "";

        while (!sen.endsWith("Stop")) {
            all += sen + " ";
            System.out.print("Enter word: ");
            sen = scan.nextLine();

        }
        System.out.println(all.trim());
    }
}

