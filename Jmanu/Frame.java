package Jmanu;

import javax.swing.JFrame;

public class Frame extends JFrame {

    Frame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(50, 30, 400, 400);
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
    }

}
