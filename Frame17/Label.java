package Frame17;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Container;

public class Label extends JFrame {

    private Container c;
    private JTabbedPane pane;
    private JPanel redpanel, bluepanel, blackJPanel;
    private JLabel label;

    Label() {
        this.setBounds(20, 20, 500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tabbed pane");
        this.setResizable(false);

        initcomponent();
    }

    public void initcomponent() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        pane = new JTabbedPane();
        pane.setBounds(100, 50, 200, 200);
        pane.setTabPlacement(JTabbedPane.TOP);

        label = new JLabel();
        label.setText("My name is anik");
        label.setBounds(50, 50, 150, 20);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.gray);

        redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.add(label);

        bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);

        blackJPanel = new JPanel();
        blackJPanel.setBackground(Color.BLACK);

        pane.addTab("red", redpanel);
        pane.addTab("Blue", bluepanel);
        pane.addTab("Black", blackJPanel);

        c.add(pane);
    }

    public static void main(String[] args) {
        Label frame = new Label();
        frame.setVisible(true);
    }
}
