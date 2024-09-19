package Frame12;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelFrame extends JFrame {

    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(new Color(47, 58, 200), 3);
        ImageIcon image = new ImageIcon("incomes.png");

        JLabel label = new JLabel();
        label.setText("Hello my name is anik");
        label.setIcon(image);
        label.setBackground(new Color(23, 23, 54));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(new Color(30, 30, 30));
        label.setOpaque(true);
        label.setFont(new Font("Arial", Font.BOLD + Font.PLAIN, 12));
        label.setForeground(Color.CYAN);
        label.setBorder(border);

        LabelFrame frame = new LabelFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }
}
