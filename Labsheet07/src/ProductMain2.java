import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product pd1 = new Product();
        pd1.name = "Pens";
        pd1.price = 10.5 ;
        pd1.quantity = 50;

        Product pd2 = new Product();
        pd2.name = "Notebooks" ;
        pd2.price = 25.75;
        pd2.quantity = 20;

        int choice = 0;

        do {
            System.out.println("welcome to Mini shop");
            System.out.println("----------------------------");
            System.out.println("Press [1] to buy Pen");
            System.out.println("Press [2] to buy Notebook");
            System.out.print("Enter a number : ");
            choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid number! Enter a number again");
            }
        }while (choice != 1 && choice != 2);
        Product selected  = (choice==1)? pd1 : pd2;
        selected.showinfo();

        System.out.print("How many" + selected.name+"do u want to buy?");
        int buy = sc.nextInt();

        selected.sell(buy);
        selected.showinfo();


        }
}

