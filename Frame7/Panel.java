package Frame7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panel extends JFrame {

    private JPanel panel;
    private Container c;
    private Border border;
    private JButton button1, button2, button3, button4, button5;
    private FlowLayout flow;

    Panel() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 30, 300, 500);
        this.setTitle("Panel");
        this.setLayout(null);

        initcomponent();
    }

    public void initcomponent() {

        c = this.getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.CYAN);

        panel = new JPanel();
        panel.setBounds(45, 40, 200, 200);
        panel.setBackground(Color.GRAY);
        c.add(panel);

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

    }

    public static void main(String[] args) {
        Panel frame = new Panel();
        frame.setVisible(true);
    }
}