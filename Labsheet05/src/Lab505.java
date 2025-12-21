import javax.swing.*;
import java.util.Scanner;

public class Lab505 {
    public static boolean is_palindrome(String word){
        word=word.toLowerCase();

        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }
    public static void main(String[] args) {String word=
    JOptionPane.showInputDialog("Enter some word:");

    if (is_palindrome(word)){JOptionPane.showMessageDialog(
            null,word+" is Palindrome");
    }else {JOptionPane.showMessageDialog(
            null,word+" is not Palindrome");
    }
    }
}
