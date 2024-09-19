package Student;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class StudentSystem extends JFrame implements MouseListener {

    protected Container c;
    protected JLabel label, flabel, llabel, idlabel, cgplabel;
    protected JTextField ffield, lfield, idfield, cgpafield;
    protected JTable table;
    protected JButton addButton, deleteButton, updateButton, clearButton;
    protected Font font;
    protected Border border;
    protected JScrollPane scroll;
    protected Cursor cursor;
    protected String column[] = { "First name", "Last name", "Id number", "cgpa number" };
    protected String raw[] = new String[4];
    protected DefaultTableModel model;

    StudentSystem() {
        this.setBounds(200, 100, 600, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Student management system");
        this.setResizable(false);
        initcomponent();
    }

    public void initcomponent() {

        font = new Font("Arial", Font.BOLD + Font.PLAIN, 12);

        border = BorderFactory.createLineBorder(Color.BLACK, 1);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        c = this.getContentPane();
        c.setBackground(Color.lightGray);
        c.setLayout(null);

        label = new JLabel();
        label.setText("student system");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(200, 20, 200, 20);
        label.setFont(font);
        label.setForeground(Color.darkGray);
        c.add(label);

        flabel = new JLabel();
        flabel.setText("First name : ");
        flabel.setHorizontalAlignment(JLabel.RIGHT);
        flabel.setBounds(0, 60, 150, 20);
        flabel.setFont(font);
        flabel.setForeground(Color.darkGray);
        c.add(flabel);

        llabel = new JLabel();
        llabel.setText("Last name : ");
        llabel.setHorizontalAlignment(JLabel.RIGHT);
        llabel.setBounds(0, 100, 150, 20);
        llabel.setFont(font);
        llabel.setForeground(Color.darkGray);
        c.add(llabel);

        idlabel = new JLabel();
        idlabel.setText("Id number : ");
        idlabel.setHorizontalAlignment(JLabel.RIGHT);
        idlabel.setBounds(0, 140, 150, 20);
        idlabel.setFont(font);
        idlabel.setForeground(Color.darkGray);
        c.add(idlabel);

        cgplabel = new JLabel();
        cgplabel.setText("Cgpa number : ");
        cgplabel.setHorizontalAlignment(JLabel.RIGHT);
        cgplabel.setBounds(0, 180, 150, 20);
        cgplabel.setFont(font);
        cgplabel.setForeground(Color.darkGray);
        c.add(cgplabel);

        ffield = new JTextField();
        ffield.setFont(font);
        ffield.setBounds(200, 60, 200, 20);
        ffield.setBorder(border);
        ffield.setToolTipText(" Enter First Name");
        ffield.setHorizontalAlignment(JTextField.CENTER);
        ffield.setBackground(Color.CYAN);
        c.add(ffield);

        lfield = new JTextField();
        lfield.setFont(font);
        lfield.setBounds(200, 100, 200, 20);
        lfield.setBorder(border);
        lfield.setToolTipText(" Enter Last Name");
        lfield.setBackground(Color.CYAN);
        lfield.setHorizontalAlignment(JTextField.CENTER);
        c.add(lfield);

        idfield = new JTextField();
        idfield.setFont(font);
        idfield.setBounds(200, 140, 200, 20);
        idfield.setBorder(border);
        idfield.setToolTipText(" Enter ID Number");
        idfield.setBackground(Color.CYAN);
        idfield.setHorizontalAlignment(JTextField.CENTER);
        c.add(idfield);

        cgpafield = new JTextField();
        cgpafield.setFont(font);
        cgpafield.setBounds(200, 180, 200, 20);
        cgpafield.setBorder(border);
        cgpafield.setToolTipText(" Enter Cgpa Number");
        cgpafield.setBackground(Color.CYAN);
        cgpafield.setHorizontalAlignment(JTextField.CENTER);
        c.add(cgpafield);

        addButton = new JButton();
        addButton.setBounds(450, 60, 100, 20);
        addButton.setText("add");
        addButton.setFocusable(false);
        addButton.setFont(font);
        addButton.setCursor(cursor);
        addButton.setHorizontalAlignment(JButton.CENTER);
        addButton.setBackground(Color.MAGENTA);
        c.add(addButton);

        deleteButton = new JButton();
        deleteButton.setBounds(450, 100, 100, 20);
        deleteButton.setText("delete");
        deleteButton.setFocusable(false);
        deleteButton.setFont(font);
        deleteButton.setCursor(cursor);
        deleteButton.setHorizontalAlignment(JButton.CENTER);
        deleteButton.setBackground(Color.MAGENTA);
        c.add(deleteButton);

        updateButton = new JButton();
        updateButton.setBounds(450, 140, 100, 20);
        updateButton.setText("update");
        updateButton.setFocusable(false);
        updateButton.setCursor(cursor);
        updateButton.setFont(font);
        updateButton.setHorizontalAlignment(JButton.CENTER);
        updateButton.setBackground(Color.MAGENTA);
        c.add(updateButton);

        clearButton = new JButton();
        clearButton.setBounds(450, 180, 100, 20);
        clearButton.setText("clear");
        clearButton.setFocusable(false);
        clearButton.setCursor(cursor);
        clearButton.setFont(font);
        clearButton.setHorizontalAlignment(JButton.CENTER);
        clearButton.setBackground(Color.MAGENTA);
        c.add(clearButton);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.lightGray);
        table.setBackground(Color.ORANGE);
        table.setRowHeight(20);

        scroll = new JScrollPane(table);
        scroll.setBounds(60, 230, 490, 150);
        c.add(scroll);

        addButton.addMouseListener(this);
        deleteButton.addMouseListener(this);
        updateButton.addMouseListener(this);
        clearButton.addMouseListener(this);

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int numberofraw = table.getSelectedRow();

                String fname = model.getValueAt(numberofraw, 0).toString();
                String lname = model.getValueAt(numberofraw, 1).toString();
                String idname = model.getValueAt(numberofraw, 2).toString();
                String cgpaname = model.getValueAt(numberofraw, 3).toString();

                ffield.setText(fname);
                lfield.setText(lname);
                idfield.setText(idname);
                cgpafield.setText(cgpaname);
            }
        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == addButton) {

            if (ffield.getText().isEmpty() && lfield.getText().isEmpty() && idfield.getText().isEmpty()
                    && cgpafield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "please enter information", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                raw[0] = ffield.getText();
                raw[1] = lfield.getText();
                raw[2] = idfield.getText();
                raw[3] = cgpafield.getText();

                model.addRow(raw);
            }
        } else if (e.getSource() == clearButton) {
            ffield.setText("");
            lfield.setText("");
            idfield.setText("");
            cgpafield.setText("");
        } else if (e.getSource() == deleteButton) {
            int numberofraw = table.getSelectedRow();

            if (numberofraw >= 0) {
                model.removeRow(numberofraw);
            } else {
                JOptionPane.showMessageDialog(null, "Please Select raw", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == updateButton) {

            int numberofraw = table.getSelectedRow();

            String fname = ffield.getText();
            String lname = lfield.getText();
            String idname = idfield.getText();
            String cgpaname = cgpafield.getText();

            model.setValueAt(fname, numberofraw, 0);
            model.setValueAt(lname, numberofraw, 1);
            model.setValueAt(idname, numberofraw, 2);
            model.setValueAt(cgpaname, numberofraw, 3);

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource() == addButton) {
            addButton.setBorder(border);
        } else if (e.getSource() == deleteButton) {
            deleteButton.setBorder(border);
        } else if (e.getSource() == updateButton) {
            updateButton.setBorder(border);
        } else if (e.getSource() == clearButton) {
            clearButton.setBorder(border);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getSource() == addButton) {
            addButton.setBorder(null);
        } else if (e.getSource() == deleteButton) {
            deleteButton.setBorder(null);
        } else if (e.getSource() == updateButton) {
            updateButton.setBorder(null);
        } else if (e.getSource() == clearButton) {
            clearButton.setBorder(null);
        }

    }

    public static void main(String[] args) {

        StudentSystem farame = new StudentSystem();
        farame.setVisible(true);
    }
}
