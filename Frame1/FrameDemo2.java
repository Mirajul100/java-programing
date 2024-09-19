package Frame1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameDemo2 extends JFrame {
    private ImageIcon icon;
    private Container box;
    private JLabel label;
    private Font f;
    private ImageIcon image;
    private JLabel img;

    FrameDemo2() {
        initcomponent();
    }

    public void initcomponent() {
        icon = new ImageIcon(getClass().getResource("moon.png"));
        this.setIconImage(icon.getImage());
        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.BLACK);

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 14);

        image = new ImageIcon(getClass().getResource("pic.png"));
        img = new JLabel(image);
        img.setBounds(50, 70, image.getIconWidth(), image.getIconHeight());
        box.add(img);

        label = new JLabel();
        label.setText("Enter your Name : ");
        label.setBounds(50, 30, 200, 30);
        label.setForeground(Color.GREEN);
        label.setToolTipText("Your name is Anik");
        label.setFont(f);
        box.add(label);
    }

    public static void main(String[] args) {
        FrameDemo2 frame = new FrameDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 40, 700, 500);
        frame.setTitle("Anik Information");
    }
}