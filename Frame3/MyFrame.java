package Frame3;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class MyFrame extends JFrame {

    private ImageIcon icon;
    private Container box;
    private JFrame frame;
    private JLabel label, pass;
    private Font font;
    private JTextField field, field1;
    private Border border, border1;

    MyFrame() {

        frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("this is title");
        this.setBounds(50, 40, 500, 500);
        this.setLayout(null);

        initcomponent();
    }

    public void initcomponent() {

        icon = new ImageIcon(getClass().getResource("rocket-lunch.png"));
        this.setIconImage(icon.getImage());

        border = BorderFactory.createLineBorder(Color.yellow, 3);
        border1 = BorderFactory.createLineBorder(Color.red, 3);

        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.BLACK);

        font = new Font("Arial", Font.BOLD + Font.ITALIC, 14);

        label = new JLabel();
        label.setText("ENTER YOUR NAME : ");
        label.setBounds(50, 30, 210, 30);
        label.setFont(font);
        label.setForeground(Color.white);
        label.setToolTipText("NAME");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBorder(border);
        box.add(label);

        pass = new JLabel();
        pass.setText("ENTER YOUR PASSWORD : ");
        pass.setBounds(50, 80, 210, 30);
        pass.setFont(font);
        pass.setForeground(Color.white);
        pass.setToolTipText("PASSWORD");
        pass.setHorizontalAlignment(JLabel.CENTER);
        pass.setBorder(border);
        pass.setVerticalAlignment(JLabel.CENTER);
        box.add(pass);

        field = new JTextField();
        field.setFont(font);
        field.setBounds(270, 30, 200, 30);
        field.setToolTipText("NAME");
        field.setBackground(Color.magenta);
        field.setBorder(border1);
        box.add(field);

        field1 = new JTextField();
        field1.setFont(font);
        field1.setBounds(270, 80, 200, 30);
        field1.setToolTipText("PASSWORD");
        field1.setBackground(Color.magenta);
        field1.setBorder(border1);
        box.add(field1);

    }
}
