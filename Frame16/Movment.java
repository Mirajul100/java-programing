package Frame16;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movment extends JFrame implements KeyListener {

    private JLabel label;
    private ImageIcon image;

    Movment() {

        this.setVisible(true);
        this.setLayout(null);
        this.setBounds(50, 50, 400, 400);
        // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);

        image = new ImageIcon("rocket.png");

        label = new JLabel();
        label.setBounds(0, 0, 50, 50);
        label.setIcon(image);
        label.setBackground(Color.CYAN);
        label.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 5));
        label.setOpaque(true);
        this.add(label);

    }

    public static void main(String[] args) {
        Movment frame = new Movment();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            case 'd':
                label.setLocation(label.getX() + 20, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 20);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            case 39:
                label.setLocation(label.getX() + 20, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 20);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println(e.getKeyChar());
        System.out.println("you entered key : " + e.getKeyCode());
    }
}
