package sumator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sumator extends JFrame implements ActionListener {

    JTextField first;
    JLabel plus;
    JTextField second;
    JButton equalsButton;
    JTextField result;

    public Sumator() {
        setLayout(new FlowLayout());

        first = new JTextField(5);
        plus = new JLabel("+");
        second = new JTextField(5);
        equalsButton = new JButton("=");
        result = new JTextField(5);

        equalsButton.addActionListener(this);

        add(first);
        add(plus);
        add(second);
        add(equalsButton);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SUMATOR");
        setSize(350, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double valueOne = Double.parseDouble(first.getText());
        double valueTwo = Double.parseDouble(second.getText());
        double sumOfValues = valueOne + valueTwo;
        result.setText(Double.toString(sumOfValues));
    }

    public static void main(String[] args) {
        new Sumator();
    }
}
