import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        String USERNAME = "admin";
        String PASSWORD = "Admin1234";

        while (true) {
            String user = JOptionPane.showInputDialog("Enter username: ");
            String pass = JOptionPane.showInputDialog("Enter password: ");
            if (user.equalsIgnoreCase(USERNAME) && pass.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login Fail....",
                        "Incorrect username or password", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

