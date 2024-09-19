package Frame14;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class Progress extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JProgressBar bar;

    Progress() {
        this.setVisible(true);
        this.setTitle("Progress bar");
        this.setBounds(50, 50, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        initcomponent();
        fill();
    }

    public void initcomponent() {

        icon = new ImageIcon(getClass().getResource("vimeo.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(23, 47, 123));

        bar = new JProgressBar();
        bar.setValue(0);
        bar.setBounds(20, 20, 340, 20);
        bar.setStringPainted(true);
        bar.setBackground(Color.CYAN);
        bar.setForeground(new Color(23, 43, 54));
        bar.setFont(new Font("Arial", Font.BOLD, 16));
        bar.setBorder(BorderFactory.createLineBorder(Color.cyan, 1));
        c.add(bar);

    }

    public void fill() {

        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Done");
    }

    public static void main(String[] args) {
        Progress frame = new Progress();
    }
}
