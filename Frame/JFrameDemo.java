package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo extends JFrame {
    private ImageIcon Icon;
    private Container box;
    private JLabel label;
    private JLabel pass;
    private Font f;

    JFrameDemo() {
        icon();
    }

    public void icon() {
        Icon = new ImageIcon(getClass().getResource("rocket-lunch.png"));
        this.setIconImage(Icon.getImage());

        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.CYAN);

        f = new Font("Arial", Font.BOLD, 14);

        label = new JLabel();
        label.setText("Enter your name : ");
        label.setBounds(50, 20, 180, 30);
        label.setFont(f);
        label.setForeground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setBackground(Color.MAGENTA);
        box.add(label);

        pass = new JLabel();
        pass.setText("Enter your password : ");
        pass.setBounds(50, 60, 180, 30);
        pass.setFont(f);
        pass.setForeground(Color.DARK_GRAY);
        pass.setOpaque(true);
        pass.setBackground(Color.MAGENTA);
        box.add(pass);
    }

    public static void main(String[] args) {
        JFrameDemo frame = new JFrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 500);
        frame.setTitle("Rocket App");
    }
}
