import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter student-id");
        if (id.length() !=10){
            JOptionPane.showInputDialog("Enter student-id");
        }
        String major = id.substring(2,5);
        String major_2 ;
        switch (major){
            case "131":
                major_2 = "Information Technology (IT)";
                break;
            case "132":
                major_2 = "Multimedia Technology (MT)";
                break;
            case "133":
                major_2 = "Digital Business Information Technology (BI)";
                break;
            case "134":
                major_2 = "Digital Technology in mass Communication (DC)";
                break;
            case "135":
                major_2 = "Data science and data Analytics (DS)";
                break;
            default:major_2 = "Cannot found major"  ;

        }
        JOptionPane.showMessageDialog(null,"Student ID: " +id+ "\nMajor: "+major_2);
    }
}
