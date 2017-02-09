package capitalLetters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToCapitalLetters extends JFrame implements ActionListener {

    JTextField input;
    JButton convertToCapitalBtn;
    JLabel result;

    public ToCapitalLetters() {
        setLayout(new FlowLayout());

        input = new JTextField(10);
        convertToCapitalBtn = new JButton("capital ->");
        result = new JLabel(" ");

        convertToCapitalBtn.addActionListener(this);
        
        add(input);
        add(convertToCapitalBtn);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Convert To Capital Letters");
        setSize(450, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String inputText = input.getText();
        result.setText(inputText.toUpperCase());
    }

    public static void main(String[] args) {
        new ToCapitalLetters();
    }
}