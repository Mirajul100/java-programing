package Frame9;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slide extends JFrame implements ActionListener {

    private Container c;
    private JPanel panel;
    private JButton button1, button2;
    private CardLayout g;
    private Cursor cursor, cursor1;
    private ImageIcon icon;
    private JLabel label;
    private Border border;
    private Font font;

    Slide() {
        initcomponent();
        showimage();
    }

    public void showimage() {
        String imagename[] = { "moon night.png", "rocket-lunch.png", "poo.png", "puu.png" };

        for (String n : imagename) {
            icon = new ImageIcon("Frame9/pic/" + n);

            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), img.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);

            label = new JLabel(icon);
            panel.add(label);

        }
    }

    public void initcomponent() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100, 100, 500, 400);
        this.setTitle("Slide");
        this.setResizable(false);

        cursor = new Cursor(Cursor.HAND_CURSOR);
        cursor1 = new Cursor(Cursor.CROSSHAIR_CURSOR);

        g = new CardLayout();

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);

        border = BorderFactory.createLineBorder(Color.GREEN, 2);
        font = new Font("Arial", Font.BOLD + Font.HANGING_BASELINE, 12);

        panel = new JPanel(g);
        panel.setBounds(20, 20, 445, 260);
        panel.setCursor(cursor1);
        panel.setBorder(border);
        c.add(panel);

        button1 = new JButton();
        button1.setBounds(20, 300, 100, 30);
        button1.setText("previews");
        button1.setFont(font);
        button1.setCursor(cursor);
        button1.setBackground(Color.DARK_GRAY);
        button1.setForeground(Color.MAGENTA);
        button1.setBorder(border);
        button1.setFocusable(false);
        c.add(button1);

        button2 = new JButton();
        button2.setBounds(365, 300, 100, 30);
        button2.setText("next");
        button2.setCursor(cursor);
        button2.setFont(font);
        button2.setBackground(Color.DARK_GRAY);
        button2.setForeground(Color.MAGENTA);
        button2.setBorder(border);
        button2.setFocusable(false);
        c.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            g.previous(panel);
        } else if (e.getSource() == button2) {
            g.next(panel);
        }
    }

    public static void main(String[] args) {
        Slide frame = new Slide();
        frame.setVisible(true);
    }
}
