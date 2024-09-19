package Frame13;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Page2 extends JFrame {

    public JLabel label, label2, label3;

    Page2() {
        this.setBounds(50, 50, 500, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        label = new JLabel("First name :- ");
        label.setBounds(50, 20, 150, 20);
        label.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(label);

        label2 = new JLabel("Last name :- ");
        label2.setBounds(50, 50, 150, 20);
        label2.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(label2);

        label3 = new JLabel("Id number :- ");
        label3.setBounds(50, 80, 150, 20);
        label3.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(label3);

    }
}
