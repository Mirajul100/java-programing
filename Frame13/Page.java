package Frame13;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Page extends JFrame implements ActionListener {

    protected JTextField field, field1, idfield;
    protected JButton submiButton;

    Page() {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(50, 50, 500, 500);
        this.setLayout(null);
        this.setBackground(Color.BLACK);

        field = new JTextField();
        field.setBounds(50, 20, 150, 20);
        field.setBackground(Color.CYAN);
        field.setForeground(Color.darkGray);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setFont(new Font("Arial", Font.BOLD, 12));
        field.setToolTipText("Enter your first name");
        field.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(field);

        field1 = new JTextField();
        field1.setBounds(50, 50, 150, 20);
        field1.setBackground(Color.CYAN);
        field1.setForeground(Color.darkGray);
        field1.setHorizontalAlignment(JTextField.CENTER);
        field1.setFont(new Font("Arial", Font.BOLD, 12));
        field1.setToolTipText("Enter your last name");
        field1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(field1);

        idfield = new JTextField();
        idfield.setBounds(50, 80, 150, 20);
        idfield.setBackground(Color.CYAN);
        idfield.setForeground(Color.darkGray);
        idfield.setHorizontalAlignment(JTextField.CENTER);
        idfield.setFont(new Font("Arial", Font.BOLD, 12));
        idfield.setToolTipText("Enter your id");
        idfield.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(idfield);

        submiButton = new JButton("Submit");
        submiButton.setBounds(50, 110, 100, 20);
        submiButton.setFocusable(false);
        submiButton.setFont(new Font("Arial", Font.BOLD, 12));
        submiButton.setBorder(BorderFactory.createEtchedBorder());
        submiButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(submiButton);
        submiButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submiButton) {
            Page2 frame = new Page2();
            frame.setVisible(true);
        }
    }
}
