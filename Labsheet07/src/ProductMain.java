import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {

        Product p = new Product();

        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");

        p.name = JOptionPane.showInputDialog("Enter product name : ");
        p.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item : "));
        p.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock : "));

        p.showinfo();

        int add = JOptionPane.showConfirmDialog(null,"Do you want to add more item?");
        if (add == JOptionPane.YES_NO_OPTION){
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            p.addStock(amount);
        }

        int change = JOptionPane.showConfirmDialog(null,"Do you want to change price?");
        if(change == JOptionPane.YES_OPTION){
            double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            p.changePrice(newPrice);
        }
        p.showinfo();
    }
}
