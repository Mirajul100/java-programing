package Swing;

import javax.swing.JOptionPane;

public class Frame {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Are you Quit this program?", "Quit",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(1);
        } else {
            String fname = JOptionPane.showInputDialog(null, "Enter your first name", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            String lname = JOptionPane.showInputDialog(null, "Enter your last name", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            String name = fname + " " + lname;
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age : ", "Information",
                    JOptionPane.INFORMATION_MESSAGE));
            JOptionPane.showMessageDialog(null, "Your name is : " + name, "Person Information",
                    JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Your age is : " + age, "Person Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
