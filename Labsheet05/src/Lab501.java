import javax.swing.*;

public class Lab501 {
    public static double cal_bmi(double weight, double height) {
        double height_ = height/100.0;
        return weight/(height_*height_);
    }

    public static String check_bmi(double bmi){
        if(bmi<18.5){
            return "Underweight";
        } else if (bmi<25) {
            return "Healthy weight";
        } else if (bmi<30) {
            return "Overweight";
        } else  {return "Obese";

        }


    }
    public static void main(String[] args){
        while (true){
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want to check your BMI?",
                    "check bmi", JOptionPane.YES_NO_OPTION);
            if (confirm!=JOptionPane.YES_OPTION){JOptionPane.showMessageDialog(
                    null,"End program!");
            break;
            }
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your Weight(kg): "));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height(cm): "));
            double bmi = cal_bmi(weight, height);
            String result = check_bmi(bmi);

            JOptionPane.showMessageDialog(
                    null,String.format("Your BMI = %.2f\n Your BMI result = %s",bmi,result));
        }
    }
}

