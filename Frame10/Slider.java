package Frame10;

import javax.swing.JFrame;
import javax.swing.JSlider;

import java.awt.Color;
import java.awt.Container;

public class Slider extends JFrame {

    private Container c;
    private JSlider slider;

    Slider() {
        initcomponent();
    }

    public void initcomponent() {
        this.setBounds(100, 100, 800, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Slider");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        slider = new JSlider(0, 20, 15);
        slider.setBounds(40, 30, 300, 50);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setBackground(Color.CYAN);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
    }

    public static void main(String[] args) {
        Slider frame = new Slider();
        frame.setVisible(true);
    }
}
