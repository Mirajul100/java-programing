package Frame5;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameDemo1 extends JFrame {
    private JLabel label, pass;
    private Container box;
    private JTextField tax;
    private JPasswordField password;
    private Font font;
    private Border border, border2;
    private JButton button1, button2;
    private Cursor cursor;
    private ImageIcon image, img, img1;

    FrameDemo1() {
        initcomponent();
    }

    public void initcomponent() {

        image = new ImageIcon(getClass().getResource("rocket-lunch.png"));
        this.setIconImage(image.getImage());
        img = new ImageIcon(getClass().getResource("icon.png"));
        img1 = new ImageIcon(getClass().getResource("clear.png"));

        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.BLACK);

        font = new Font("Arial", Font.BOLD + Font.ITALIC + Font.PLAIN, 14);

        border = BorderFactory.createLineBorder(Color.CYAN, 2);
        border2 = BorderFactory.createLineBorder(Color.MAGENTA, 2);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        label = new JLabel();
        label.setText("ENTER YOUR NAME : ");
        label.setBounds(50, 30, 200, 30);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(font);
        label.setToolTipText("NAME");
        box.add(label);

        pass = new JLabel();
        pass.setText("ENTER YOUR PASSWORD : ");
        pass.setBounds(50, 70, 200, 30);
        pass.setHorizontalAlignment(JLabel.CENTER);
        pass.setVerticalAlignment(JLabel.CENTER);
        pass.setForeground(Color.BLUE);
        pass.setFont(font);
        pass.setToolTipText("PASSWORD");
        box.add(pass);

        tax = new JTextField();
        tax.setFont(font);
        tax.setHorizontalAlignment(JTextField.CENTER);
        tax.setBounds(250, 30, 200, 30);
        tax.setForeground(Color.BLUE);
        tax.setBorder(border);
        tax.setToolTipText("NAME");
        box.add(tax);

        password = new JPasswordField();
        password.setFont(font);
        password.setHorizontalAlignment(JPasswordField.CENTER);
        password.setBounds(250, 70, 200, 30);
        password.setBorder(border);
        password.setToolTipText("PASSWORD");
        box.add(password);

        button1 = new JButton();
        button1.setText("Login");
        button1.setBackground(Color.YELLOW);
        button1.setForeground(Color.BLACK);
        button1.setIcon(img);
        button1.setFocusable(false);
        button1.setBorder(border2);
        button1.setCursor(cursor);
        button1.setBounds(250, 120, 80, 30);
        box.add(button1);

        button2 = new JButton(img1);
        button2.setText("Clear");
        button2.setBackground(Color.YELLOW);
        button2.setForeground(Color.BLACK);
        button2.setBorder(border2);
        button2.setCursor(cursor);
        button2.setBounds(370, 120, 80, 30);
        button2.setFocusable(false);
        box.add(button2);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tax.setText("");
                password.setText("");
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tax.getText();
                String user_pass = password.getText();
                if (name.equals("Anik") || name.equals("anik") || name.equals("ANIK") && user_pass.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "you are login successfully");
                    FrameDemo demo = new FrameDemo();
                    demo.setVisible(true);
                } else if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your password and name!", "Information",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong password and Wrong name");
                }
            }
        });

    }

    public static void main(String[] args) {
        FrameDemo1 frame = new FrameDemo1();
        frame.setVisible(true);
        frame.setBounds(50, 50, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        frame.setLayout(null);
        frame.setResizable(false);
    }
}
