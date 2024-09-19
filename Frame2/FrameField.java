package Frame2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameField extends JFrame {
    private ImageIcon icon;
    private JLabel label;
    private Container box;
    private Font font;
    private JLabel pass;
    private ImageIcon image;
    private JLabel img;
    private JTextField field, field2;

    FrameField() {
        initcomponent();
    }

    public void initcomponent() {
        icon = new ImageIcon(getClass().getResource("Anik.png"));
        this.setIconImage(icon.getImage());

        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.BLACK);

        image = new ImageIcon(getClass().getResource("moon night.png"));
        img = new JLabel(image);
        img.setBounds(50, 130, image.getIconWidth(), image.getIconHeight());
        box.add(img);

        font = new Font("Anial", Font.BOLD + Font.ITALIC, 14);

        label = new JLabel();
        label.setBounds(50, 30, 200, 30);
        label.setText("Enter your name           :- ");
        label.setForeground(Color.GREEN);
        label.setFont(font);
        label.setToolTipText("NAME");
        box.add(label);

        pass = new JLabel();
        pass.setText("Enter your password   :- ");
        pass.setBounds(50, 70, 200, 30);
        pass.setForeground(Color.GREEN);
        pass.setFont(font);
        pass.setToolTipText("PASSWORD");
        box.add(pass);

        field = new JTextField();
        field.setText("");
        field.setBounds(250, 30, 200, 30);
        field.setToolTipText("ENTER NAME");
        field.setBackground(Color.ORANGE);
        field.setForeground(Color.MAGENTA);
        field.setFont(font);
        box.add(field);

        field2 = new JTextField();
        field2.setText("");
        field2.setBounds(250, 70, 200, 30);
        field2.setToolTipText("ENTER PASSWORD");
        field2.setBackground(Color.ORANGE);
        field2.setForeground(Color.MAGENTA);
        field2.setFont(font);
        box.add(field2);
    }

    public static void main(String[] args) {
        FrameField frame = new FrameField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 30, 700, 500);
        frame.setTitle("Hello World");
    }
}
