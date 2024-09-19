
import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Eenter your name");
        JOptionPane.showMessageDialog(null,"Your name is "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        JOptionPane.showMessageDialog(null,"your age is : "+age+" Year old");
        int roll = Integer.parseInt(JOptionPane.showInputDialog("Enter your roll number : "));
        JOptionPane.showMessageDialog(null, "Your roll number is : "+roll);
        double cgpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your cgpa"));
        JOptionPane.showMessageDialog(null,"your cgpa is : "+cgpa);
        double tall = Double.parseDouble(JOptionPane.showInputDialog("Enter your hight"));
        JOptionPane.showMessageDialog(null,"your hight is : "+tall+" foot");
        String mother = JOptionPane.showInputDialog("Enter your mother name");
        JOptionPane.showMessageDialog(null,"your mother name is "+mother);
        String father = JOptionPane.showInputDialog(null,"Enter your Father name : ");
        JOptionPane.showMessageDialog(null,"Your father name is : "+father);

    }
}
