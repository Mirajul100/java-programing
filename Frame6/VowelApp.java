package Frame6;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class VowelApp extends JFrame {

    private Container c;
    private JLabel label;
    private JTextArea area;
    private JButton clearButton;
    private JScrollPane scroll;
    private Font font, font1;
    private Cursor cursor;
    private Border border;
    private JLabel labela, labele, labeli, labelo, labelu, totallabel;

    int totalvowel = 0;
    int a = 0;
    int le = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    VowelApp() {

        this.setTitle("VOWEL CONTAINER APP");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(300, 100, 600, 400);
        this.setResizable(false);
        this.setLayout(null);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        font = new Font("Arial", Font.BOLD + Font.ITALIC, 12);
        font1 = new Font("Arial", Font.BOLD + Font.ITALIC, 14);

        border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        label = new JLabel();
        label.setText("ENTER THE TEXT : ");
        label.setBounds(50, 40, 150, 20);
        label.setFont(font);
        label.setForeground(Color.BLACK);
        c.add(label);

        area = new JTextArea();
        area.setBackground(Color.white);
        area.setForeground(Color.BLACK);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(font1);
        area.setBorder(border);

        scroll = new JScrollPane(area);
        scroll.setBounds(170, 30, 400, 50);
        c.add(scroll);

        clearButton = new JButton();
        clearButton.setBorder(border);
        clearButton.setBounds(315, 90, 100, 20);
        clearButton.setText("CLEAR");
        clearButton.setFocusable(false);
        clearButton.setCursor(cursor);
        clearButton.setBackground(Color.lightGray);
        c.add(clearButton);

        totallabel = new JLabel();
        totallabel.setBounds(170, 120, 200, 20);
        c.add(totallabel);

        labela = new JLabel();
        labela.setBounds(170, 140, 200, 20);
        c.add(labela);

        labele = new JLabel();
        labele.setBounds(170, 160, 200, 20);
        c.add(labele);

        labeli = new JLabel();
        labeli.setBounds(170, 180, 200, 20);
        c.add(labeli);

        labelo = new JLabel();
        labelo.setBounds(170, 200, 200, 20);
        c.add(labelo);

        labelu = new JLabel();
        labelu.setBounds(170, 220, 200, 20);
        c.add(labelu);

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setText("");
                totallabel.setText("");
                labela.setText("");
                labele.setText("");
                labeli.setText("");
                labelo.setText("");
                labelu.setText("");
                a = 0;
                le = 0;
                i = 0;
                o = 0;
                u = 0;
                totalvowel = 0;
            }
        });

        area.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getSource() == area) {
                    if (e.VK_A == e.getKeyCode()) {
                        a++;
                        totalvowel++;
                    } else if (e.VK_E == e.getKeyCode()) {
                        le++;
                        totalvowel++;
                    } else if (e.VK_I == e.getKeyCode()) {
                        i++;
                        totalvowel++;
                    } else if (e.VK_O == e.getKeyCode()) {
                        o++;
                        totalvowel++;
                    } else if (e.VK_U == e.getKeyCode()) {
                        u++;
                        totalvowel++;
                    }
                }

                totallabel.setText("TOTAL VOWEL IS : " + totalvowel);
                labela.setText("TOTAL NUMBER OF A IS : " + a);
                labele.setText("TOTAL NUMBER OF E IS : " + le);
                labeli.setText("TOTAL NUMBER OF I IS : " + i);
                labelo.setText("TOTAL NUMBER OF O IS : " + o);
                labelu.setText("TOTAL NUMBER OF U IS : " + u);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        VowelApp framApp = new VowelApp();
        framApp.setVisible(true);
    }
}
