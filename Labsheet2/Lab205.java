import javax.swing.*;
import java.text.DecimalFormat;

public class Lab205 {
    public static void main(String[] args) {
        int  min = Integer.parseInt(
                JOptionPane.showInputDialog("Input Minutes:"));
        int hours = min/60;
        int minute = min%60;
        JOptionPane.showMessageDialog(null,
                min+"minutes is"  + hours +" hour" + minute +"minute"  );

    }
}
