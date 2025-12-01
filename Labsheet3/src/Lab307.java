import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("input price [press0 to stop]:"));
        int sum=0;
        while (num1!=0){

            while (num1<=0) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("invalid price!!\n input price [press0 to stop]"));}

                sum+=num1;
                num1 = Double.parseDouble(
                        JOptionPane.showInputDialog("input price [press0 to stop]:"));


        }
        JOptionPane.showMessageDialog(null,"Total price is "+sum+" baht.");
    }

}

