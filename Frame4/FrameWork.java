package Frame4;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWork extends JFrame {

    protected ImageIcon icon;
    protected Container box;
    protected JLabel label, pass1;
    protected JPasswordField pass;
    protected JTextField field;
    protected Font font;
    protected Border border;

    FrameWork() {
        this.setBounds(50, 30, 600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TITLE");
        initcomponent();
    }

    public void initcomponent() {

        icon = new ImageIcon(getClass().getResource("vimeo.png"));
        this.setIconImage(icon.getImage());

        border = BorderFactory.createLineBorder(Color.BLUE, 2);

        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.LIGHT_GRAY);

        font = new Font("Arial", Font.BOLD, 15);

        label = new JLabel();
        label.setText("ENTER YOUR NAME : ");
        label.setBounds(50, 30, 210, 30);
        label.setToolTipText("NAME");
        label.setForeground(Color.BLACK);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(font);
        box.add(label);

        pass1 = new JLabel();
        pass1.setText("ENTER YOUR PASSWORD : ");
        pass1.setBounds(50, 70, 210, 30);
        pass1.setToolTipText("PASSWORD");
        pass1.setForeground(Color.BLACK);
        pass1.setHorizontalAlignment(JLabel.CENTER);
        pass1.setVerticalAlignment(JLabel.CENTER);
        pass1.setFont(font);
        box.add(pass1);

        field = new JTextField();
        field.setBounds(270, 30, 210, 30);
        field.setToolTipText("NAME");
        field.setFont(font);
        field.setForeground(Color.BLACK);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBorder(border);
        box.add(field);

        pass = new JPasswordField();
        pass.setBounds(270, 70, 210, 30);
        pass.setToolTipText("PASSWORD");
        pass.setFont(font);
        pass.setForeground(Color.BLACK);
        pass.setHorizontalAlignment(JPasswordField.CENTER);
        pass.setBorder(border);
        box.add(pass);

        field.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = field.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you did't Enter anything", "nothing",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Your name is : " + s, "NAME",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }

}
