package Frame5;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class FrameDemo extends JFrame {

    protected Container c;
    protected ImageIcon icon;
    protected JTextArea area;
    protected Border border;
    protected Font font;
    protected JScrollPane scroll1;

    public FrameDemo() {

        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());

        border = BorderFactory.createLineBorder(Color.BLACK, 2);

        font = new Font("Arial", Font.BOLD, 16);

        this.setBounds(300, 50, 614, 637);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Node");
        this.setLayout(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        area = new JTextArea();
        area.setBorder(border);
        area.setFont(font);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBackground(Color.CYAN);
        area.setForeground(Color.DARK_GRAY);

        scroll1 = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setBounds(0, 0, 600, 600);
        c.add(scroll1);

    }

    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();
        frame.setVisible(true);

    }
}
