package Jmanu;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

import Frame5.FrameDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manu extends JFrame implements ActionListener {

    private Container c;
    private JMenuBar menuBar;
    private JMenu File, Edit, Help;
    private Font font;
    private Border border;
    private JMenuItem newmenu, exitmenu, openmenu, cut, copy, past;
    private ImageIcon icon;

    Manu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100, 100, 500, 500);
        initcomponent();
    }

    public void initcomponent() {

        icon = new ImageIcon(getClass().getResource("incomes.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setBackground(new Color(132, 182, 229));
        c.setLayout(null);

        font = new Font("Arial", Font.BOLD + Font.PLAIN, 12);

        border = BorderFactory.createLineBorder(Color.black, 2);

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        menuBar.setBackground(Color.CYAN);
        menuBar.setFont(font);
        menuBar.setBorder(border);

        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Help = new JMenu("Help");

        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);

        newmenu = new JMenuItem("  new  ");
        newmenu.setHorizontalAlignment(JMenuItem.CENTER);
        newmenu.setVerticalAlignment(JMenuItem.CENTER);
        newmenu.setBorder(border);
        newmenu.setBackground(new Color(129, 100, 67));

        exitmenu = new JMenuItem("  exit  ");
        exitmenu.setHorizontalAlignment(JMenuItem.CENTER);
        exitmenu.setVerticalAlignment(JMenuItem.CENTER);
        exitmenu.setBorder(border);
        exitmenu.setBackground(new Color(129, 100, 67));

        openmenu = new JMenuItem("  open  ");
        openmenu.setHorizontalAlignment(JMenuItem.CENTER);
        openmenu.setVerticalAlignment(JMenuItem.CENTER);
        openmenu.setBorder(border);
        openmenu.setBackground(new Color(129, 100, 67));

        cut = new JMenuItem("  cut  ");
        cut.setHorizontalAlignment(JMenuItem.CENTER);
        cut.setVerticalAlignment(JMenuItem.CENTER);
        cut.setBorder(border);
        cut.setBackground(new Color(129, 100, 67));

        copy = new JMenuItem("  cory  ");
        copy.setHorizontalAlignment(JMenuItem.CENTER);
        copy.setVerticalAlignment(JMenuItem.CENTER);
        copy.setBorder(border);
        copy.setBackground(new Color(129, 100, 67));

        past = new JMenuItem("  past  ");
        past.setHorizontalAlignment(JMenuItem.CENTER);
        past.setVerticalAlignment(JMenuItem.CENTER);
        past.setBorder(border);
        past.setBackground(new Color(129, 100, 67));

        File.add(newmenu);
        File.addSeparator();
        File.add(exitmenu);
        File.addSeparator();
        File.add(openmenu);

        Edit.add(cut);
        Edit.addSeparator();
        Edit.add(copy);
        Edit.addSeparator();
        Edit.add(past);

        newmenu.addActionListener(this);
        exitmenu.addActionListener(this);
        openmenu.addActionListener(this);

    }

    public static void main(String[] args) {
        Manu frame = new Manu();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newmenu) {
            FrameDemo fram = new FrameDemo();
            fram.setVisible(true);

        } else if (e.getSource() == exitmenu) {
            System.exit(0);
        } else if (e.getSource() == openmenu) {
            Frame frame = new Frame();
            frame.setVisible(true);
        }
    }
}
