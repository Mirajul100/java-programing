package Frame8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame {

    private Container c;
    // private BorderLayout borderLayout;
    private GridLayout l;
    private JPanel panel, panel1, panel2, panel3;
    private JButton button, button1;

    Panel() {
        Frame();
    }

    public void Frame() {
        this.setBounds(50, 50, 500, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("PANEL");

        // borderLayout = new BorderLayout();
        l = new GridLayout(2, 2, 10, 10);

        c = this.getContentPane();
        c.setLayout(l);
        c.setBackground(Color.BLACK);

        button = new JButton();
        button.setText("PINK");
        button.setFocusable(false);

        button1 = new JButton("BACK");
        button1.setFocusable(false);

        panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.add(button);
        panel.add(button1);
        c.add(panel);

        panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBackground(Color.ORANGE);
        c.add(panel2);

        panel3 = new JPanel();
        panel3.setBackground(Color.YELLOW);
        c.add(panel3);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.pink);
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        });
    }

    public static void main(String[] args) {
        Panel frame = new Panel();
        frame.setVisible(true);
    }
}
