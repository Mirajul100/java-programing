package Frame15;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Colorcu extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;
    private Container c;
    private JColorChooser colorChooser;

    Colorcu() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(50, 50, 500, 57);

        initcomponent();
    }

    public void initcomponent() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        button = new JButton("Color");
        button.setBounds(0, 0, 150, 20);
        button.setFocusable(false);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setBackground(Color.ORANGE);
        button.setForeground(Color.darkGray);
        button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        c.add(button);

        label = new JLabel("What the color you choose");
        label.setBounds(200, 0, 200, 20);
        label.setFocusable(false);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setForeground(Color.darkGray);
        c.add(label);

        button.addActionListener(this);

    }

    public static void main(String[] args) {
        Colorcu frame = new Colorcu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);
            label.setForeground(color);
        }
    }
}
