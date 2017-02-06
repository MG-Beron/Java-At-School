package chooseFruits;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseFruits extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;
    JLabel l2;
    JButton b2;
    JLabel l3;
    JButton b3;

    public ChooseFruits() {
        setLayout(new FlowLayout());

        b1 = new JButton("Apple");
        add(b1);
        b1.addActionListener(this);
        l1 = new JLabel("0");
        add(l1);

        b2 = new JButton("Banana");
        add(b2);
        b2.addActionListener(this);
        l2 = new JLabel("0");
        add(l2);

        b3 = new JButton("Orange");
        add(b3);
        b3.addActionListener(this);
        l3 = new JLabel("0");
        add(l3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Choose fruits!");
        setSize(350, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setText(Integer.parseInt(l1.getText()) + 1 + "");
        } else if (e.getSource() == b2) {
            l2.setText(Integer.parseInt(l2.getText()) + 1 + "");
        } else if (e.getSource() == b3) {
            l3.setText(Integer.parseInt(l2.getText()) + 1 + "");
        }
    }

    public static void main(String[] args) {
        new ChooseFruits();
    }
}
