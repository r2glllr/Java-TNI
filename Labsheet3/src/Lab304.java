import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("####.00");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height :"));

        double height_2 = height/100.0 ;
        double bmi = weight/(height_2*height_2);
        if (bmi<18.5) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + (frm.format(bmi)) +"\n"+ "BMI result is Underweight");
        } else if (bmi>18.5 && bmi<24.9) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + (frm.format(bmi)) +"\n"+ "BMI result is Healthly Weight");

        }
        else if (bmi>25 && bmi<29.9) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + (frm.format(bmi)) +"\n"+ "BMI result is Overweight");

        }
        else if (bmi>30) {
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + (frm.format(bmi)) +"\n"+ "BMI result is Obese");

        }




    }



}
