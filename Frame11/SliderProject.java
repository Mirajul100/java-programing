package Frame11;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderProject extends JFrame implements ChangeListener {

    private Container c;
    private JSlider red, blue, green;
    private JLabel label, label1, label2;
    private Cursor cursor;
    private Font font;
    private JTextField field, field1, field2;
    private Border border, border1;
    private JPanel panel;
    private ImageIcon icon;
    private JButton clearButton;
    private Color color;

    SliderProject() {
        this.setBounds(100, 100, 800, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("RGB COLOR SHOW");
        this.setResizable(false);
        project();
    }

    public void project() {

        icon = new ImageIcon(getClass().getResource("pngegg.png"));
        this.setIconImage(icon.getImage());

        cursor = new Cursor(Cursor.HAND_CURSOR);

        font = new Font("Arial", Font.BOLD + Font.ITALIC, 12);

        border = BorderFactory.createLineBorder(Color.green, 1);
        border1 = BorderFactory.createLineBorder(Color.black, 1);

        color = new Color(19, 27, 54);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(color);

        label = new JLabel("RED");
        label.setBounds(30, 55, 50, 20);
        label.setBackground(Color.CYAN);
        label.setForeground(Color.red);
        label.setFont(font);
        c.add(label);

        label1 = new JLabel("GREEN");
        label1.setBounds(30, 95, 50, 20);
        label1.setBackground(Color.CYAN);
        label1.setForeground(Color.GREEN);
        label1.setFont(font);
        c.add(label1);

        label2 = new JLabel("BLUE");
        label2.setBounds(30, 135, 50, 20);
        label2.setBackground(Color.CYAN);
        label2.setForeground(Color.BLUE);
        label2.setFont(font);
        c.add(label2);

        red = new JSlider(0, 255, 0);
        red.setBounds(80, 50, 400, 30);
        red.setCursor(cursor);
        red.setBackground(color);
        c.add(red);

        green = new JSlider(0, 255, 0);
        green.setBounds(80, 130, 400, 30);
        green.setCursor(cursor);
        green.setBackground(color);
        c.add(green);

        blue = new JSlider(0, 255, 0);
        blue.setBounds(80, 90, 400, 30);
        blue.setCursor(cursor);
        blue.setBackground(color);
        c.add(blue);

        field = new JTextField();
        field.setBounds(500, 55, 50, 20);
        field.setBackground(Color.lightGray);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setFont(font);
        field.setBorder(border);
        c.add(field);

        field1 = new JTextField();
        field1.setBounds(500, 95, 50, 20);
        field1.setBackground(Color.lightGray);
        field1.setHorizontalAlignment(JTextField.CENTER);
        field1.setFont(font);
        field1.setBorder(border);
        c.add(field1);

        field2 = new JTextField();
        field2.setBounds(500, 135, 50, 20);
        field2.setBackground(Color.lightGray);
        field2.setFont(font);
        field2.setHorizontalAlignment(JTextField.CENTER);
        field2.setBorder(border);
        c.add(field2);

        panel = new JPanel();
        panel.setBounds(590, 55, 150, 100);
        panel.setBackground(Color.ORANGE);
        panel.setBorder(border1);
        c.add(panel);

        clearButton = new JButton();
        clearButton.setText("CLEAR");
        clearButton.setBounds(375, 170, 100, 20);
        clearButton.setFocusable(false);
        clearButton.setFont(font);
        clearButton.setBorder(border1);
        clearButton.setBackground(Color.LIGHT_GRAY);
        c.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                red.setValue(0);
                green.setValue(0);
                blue.setValue(0);
                panel.setBackground(Color.orange);
            }
        });

        red.addChangeListener(this);
        blue.addChangeListener(this);
        green.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        int redvalue = red.getValue();
        int greenvalue = green.getValue();
        int bluevalue = blue.getValue();

        field.setText("" + redvalue);
        field1.setText("" + bluevalue);
        field2.setText("" + greenvalue);

        Color color = new Color(redvalue, bluevalue, greenvalue);
        panel.setBackground(color);

    }

    public static void main(String[] args) {
        SliderProject frame = new SliderProject();
        frame.setVisible(true);
    }
}
