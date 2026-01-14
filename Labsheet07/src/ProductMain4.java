import java.util.Scanner;

public class ProductMain4 {
    public static void setting_product(Product[] products) {
        String[] names = {"Pens", "Pencils", "Markers", "highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];
        setting_product(products);

        System.out.println("Welcome to mini shop!!");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Press " + (i + 1) + " to buy " + products[i].name + " (items=" + products[i].quantity + ")");
        }
        System.out.println("----------------------------");
        int choice;

        System.out.print("Enter a number: ");
        choice = sc.nextInt();
            while (choice < 1 || choice > 4) {
                System.out.print("Invalid! Enter a number again: ");
                choice = sc.nextInt();
            }
        System.out.println("----------------------------");


            Product selected = products[choice - 1];

            System.out.print("How many " + selected.name + " do you want to buy?");
            int buy = sc.nextInt();

            selected.sell(buy);
            selected.showinfo();
        }
}


