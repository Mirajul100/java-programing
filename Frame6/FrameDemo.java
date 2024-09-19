package Frame6;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class FrameDemo extends JFrame {

    private Container c;
    private JRadioButton rButton, fButton;
    private JCheckBox cbox, javaBox, pyBox;
    private Font font;
    private JComboBox combo;
    private Border border;
    private ButtonGroup group, group2;
    private Cursor cursor;
    private String blood[] = { "O+", "A+", "A-", "B+", "B-" };
    private JLabel label1, label2, label3, label4;
    private JButton buttonred, buttonblue, buttonblack, vowelButton;

    FrameDemo() {
        this.setBounds(100, 100, 500, 600);
        this.setLayout(null);
        this.setTitle("Frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        font = new Font("Arial", Font.BOLD + Font.ITALIC, 12);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        border = BorderFactory.createLineBorder(Color.darkGray, 2);

        rButton = new JRadioButton();
        rButton.setText("MALE");
        rButton.setBounds(50, 50, 80, 20);
        rButton.setBackground(Color.ORANGE);
        rButton.setHorizontalAlignment(JRadioButton.LEFT);
        rButton.setForeground(Color.BLACK);
        rButton.setCursor(cursor);
        rButton.setFocusable(false);
        rButton.setFont(font);
        c.add(rButton);

        fButton = new JRadioButton();
        fButton.setText("FEMALE");
        fButton.setBounds(130, 50, 80, 20);
        fButton.setBackground(Color.ORANGE);
        fButton.setHorizontalAlignment(JRadioButton.LEFT);
        fButton.setForeground(Color.BLACK);
        fButton.setFocusable(false);
        fButton.setCursor(cursor);
        fButton.setFont(font);
        c.add(fButton);

        group = new ButtonGroup();
        group.add(rButton);
        group.add(fButton);

        cbox = new JCheckBox();
        cbox.setText("C");
        cbox.setBounds(50, 100, 80, 20);
        cbox.setHorizontalAlignment(JCheckBox.LEFT);
        cbox.setFont(font);
        cbox.setCursor(cursor);
        cbox.setFocusable(false);
        cbox.setBackground(Color.ORANGE);
        c.add(cbox);

        javaBox = new JCheckBox();
        javaBox.setText("JAVA");
        javaBox.setBounds(50, 130, 80, 20);
        javaBox.setHorizontalAlignment(JCheckBox.LEFT);
        javaBox.setFont(font);
        javaBox.setCursor(cursor);
        javaBox.setFocusable(false);
        javaBox.setBackground(Color.ORANGE);
        c.add(javaBox);

        pyBox = new JCheckBox();
        pyBox.setText("PYTHON");
        pyBox.setBounds(50, 160, 80, 20);
        pyBox.setHorizontalAlignment(JCheckBox.LEFT);
        pyBox.setFont(font);
        pyBox.setCursor(cursor);
        pyBox.setFocusable(false);
        pyBox.setBackground(Color.ORANGE);
        c.add(pyBox);

        group2 = new ButtonGroup();
        group2.add(cbox);
        group2.add(javaBox);
        group2.add(pyBox);

        combo = new JComboBox<>(blood);
        combo.setBounds(50, 210, 80, 20);
        combo.setBackground(Color.CYAN);
        combo.setEditable(true);
        combo.setFont(font);
        combo.setCursor(cursor);
        c.add(combo);

        label1 = new JLabel();
        label1.setBounds(140, 210, 170, 20);
        label1.setForeground(Color.black);
        label1.setFont(font);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        c.add(label1);

        buttonred = new JButton();
        buttonred.setBounds(50, 250, 70, 20);
        buttonred.setText("RED");
        buttonred.setBorder(border);
        buttonred.setFont(font);
        buttonred.setForeground(Color.darkGray);
        buttonred.setCursor(cursor);
        buttonred.setBackground(Color.magenta);
        buttonred.setFocusable(false);
        c.add(buttonred);

        buttonblack = new JButton();
        buttonblack.setBounds(130, 250, 70, 20);
        buttonblack.setText("BLACK");
        buttonblack.setBorder(border);
        buttonblack.setFont(font);
        buttonblack.setCursor(cursor);
        buttonblack.setForeground(Color.darkGray);
        buttonblack.setBackground(Color.magenta);
        buttonblack.setFocusable(false);
        c.add(buttonblack);

        buttonblue = new JButton();
        buttonblue.setBounds(210, 250, 70, 20);
        buttonblue.setText("BLUE");
        buttonblue.setBorder(border);
        buttonblue.setFont(font);
        buttonblue.setCursor(cursor);
        buttonblue.setForeground(Color.darkGray);
        buttonblue.setBackground(Color.magenta);
        buttonblue.setFocusable(false);
        c.add(buttonblue);

        vowelButton = new JButton();
        vowelButton.setBounds(50, 300, 230, 20);
        vowelButton.setText("VOWEL APP");
        vowelButton.setBorder(border);
        vowelButton.setFont(font);
        vowelButton.setCursor(cursor);
        vowelButton.setForeground(Color.darkGray);
        vowelButton.setBackground(Color.lightGray);
        vowelButton.setFocusable(false);
        c.add(vowelButton);

        combo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = combo.getSelectedItem().toString();
                label1.setText("YOU HAVE SELECTED : " + s);
                label1.setBorder(border);
            }
        });

        buttonred.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rButton.setBackground(Color.red);
                rButton.setForeground(Color.black);
                fButton.setBackground(Color.red);
                fButton.setForeground(Color.black);
                cbox.setBackground(Color.red);
                cbox.setForeground(Color.black);
                javaBox.setBackground(Color.red);
                javaBox.setForeground(Color.black);
                pyBox.setBackground(Color.red);
                pyBox.setForeground(Color.black);
                c.setBackground(Color.red);
            }
        });

        buttonblack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rButton.setBackground(Color.black);
                rButton.setForeground(Color.GREEN);
                fButton.setBackground(Color.black);
                fButton.setForeground(Color.green);
                cbox.setBackground(Color.black);
                cbox.setForeground(Color.GREEN);
                javaBox.setBackground(Color.black);
                javaBox.setForeground(Color.GREEN);
                pyBox.setBackground(Color.black);
                pyBox.setForeground(Color.GREEN);
                c.setBackground(Color.black);
            }
        });

        buttonblue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rButton.setBackground(Color.blue);
                rButton.setForeground(Color.white);
                fButton.setBackground(Color.blue);
                fButton.setForeground(Color.white);
                cbox.setBackground(Color.blue);
                cbox.setForeground(Color.white);
                javaBox.setBackground(Color.blue);
                javaBox.setForeground(Color.white);
                pyBox.setBackground(Color.blue);
                pyBox.setForeground(Color.white);
                c.setBackground(Color.blue);
            }
        });

        vowelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                VowelApp app = new VowelApp();
                app.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        FrameDemo demo = new FrameDemo();
        demo.setVisible(true);
    }
}
