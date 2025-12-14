import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog("Enter your full name: ");
            if (!name.contains(" ")){JOptionPane.showInputDialog("Enter your full name: ");
            continue;
        }
            int showmess = name.indexOf(" ");
            String first = name.substring(0,showmess);
            String last = name.substring(showmess+1);
        JOptionPane.showMessageDialog(null,
                "welcome,"+ first.substring(0,1).toUpperCase()+first.substring(1)
                        + " " + last.toUpperCase() );
        break;
    }
    }
}


