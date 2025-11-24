import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#,###.00");

        double price_ = 299;
        double vatt = 7;
        int cus_tomer = Integer.parseInt(
                JOptionPane.showInputDialog("How many customer?"));

        double price = (double) cus_tomer*price_*vatt/100;
        double price_net = price_*cus_tomer+price;


        double prce = Integer.parseInt(
                JOptionPane.showInputDialog("Price with NET is" +frm.format(price_net)+ "baht." +
                        "\nHow much of discount(%) on your coupon?"));

        double total = price_net*(100-10) / 100;
        int total_ = Integer.parseInt(
                JOptionPane.showInputDialog("Total price is" + frm.format(total)+ "baht." +
                        "\nEnter the amount the customer paid:"));

        double all = (double) total_-total;
        JOptionPane.showMessageDialog(null,
                "Total price is" +frm.format(total)+ "baht" + "\nCustomer paid " +frm.format(total_)+ "baht."+ "\nGet change " +frm.format(all)+ "baht");



    }
}
