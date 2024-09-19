package Frame6;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameApp extends JFrame {

    private JLabel label1, label2;
    private JTextField field;
    private Container box;
    private Font font;
    private Border border;
    private JPasswordField pass;
    private JButton button1, button2;
    private Cursor cursor;

    FrameApp() {
        initcomponent();
    }

    public void initcomponent() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 400, 300);
        this.setLayout(null);
        this.setTitle("login");
        this.setResizable(false);

        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.BLACK);

        font = new Font("Arial", Font.BOLD + Font.ITALIC, 12);

        border = BorderFactory.createLineBorder(Color.GREEN, 1);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        label1 = new JLabel();
        label1.setText("ENTER YOUR NAME : ");
        label1.setBounds(10, 30, 170, 20);
        label1.setForeground(Color.GREEN);
        label1.setToolTipText("NAME");
        label1.setFont(font);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        box.add(label1);

        label2 = new JLabel();
        label2.setText("ENTER YOUR PASSWORD : ");
        label2.setBounds(10, 70, 170, 20);
        label2.setForeground(Color.GREEN);
        label2.setFont(font);
        label2.setToolTipText("PASSWORD");
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        box.add(label2);

        field = new JTextField();
        field.setBounds(190, 30, 170, 20);
        field.setToolTipText("NAME");
        field.setForeground(Color.black);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBackground(Color.CYAN);
        field.setBorder(border);
        field.setFont(font);
        box.add(field);

        pass = new JPasswordField();
        pass.setBounds(190, 70, 170, 20);
        pass.setBackground(Color.CYAN);
        pass.setBorder(border);
        pass.setHorizontalAlignment(JPasswordField.CENTER);
        pass.setToolTipText("PASSWORD");
        pass.setForeground(Color.BLACK);
        box.add(pass);

        button1 = new JButton();
        button1.setBorder(border);
        button1.setBounds(190, 110, 70, 20);
        button1.setText("LOGIN");
        button1.setForeground(Color.GREEN);
        button1.setBackground(Color.DARK_GRAY);
        button1.setCursor(cursor);
        button1.setFocusable(false);
        button1.setBorder(border);
        box.add(button1);

        button2 = new JButton();
        button2.setBorder(border);
        button2.setBounds(290, 110, 70, 20);
        button2.setText("CLEAR");
        button2.setForeground(Color.GREEN);
        button2.setBackground(Color.DARK_GRAY);
        button2.setCursor(cursor);
        button2.setFocusable(false);
        button2.setBorder(border);
        box.add(button2);

        Handelar handelar = new Handelar();
        button1.addActionListener(handelar);
        button2.addActionListener(handelar);
    }

    public class Handelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String name = field.getText();
            String password = pass.getText();

            if (e.getSource() == button2) {
                field.setText("");
                pass.setText("");
            } else if (name.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR NAME AND PASSWORD", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                if ((name.equals("anik") || name.equals("Anik") || name.equals("ANIK")) && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN", "INFORMATION", JOptionPane.NO_OPTION);
                    dispose();
                    FrameDemo frame = new FrameDemo();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE RIGHT PASSWORD AND NAME", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        FrameApp frame = new FrameApp();
        frame.setVisible(true);
    }
}
