package reverseString;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReverseString extends JFrame implements ActionListener {

    JTextField input;
    JButton reverseBtn;
    JLabel result;

    public ReverseString() {
        setLayout(new FlowLayout());

        input = new JTextField(10);
        reverseBtn = new JButton("reverse ->");
        result = new JLabel("");

        reverseBtn.addActionListener(this);

        add(input);
        add(reverseBtn);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mega String Reverser 3000");
        setSize(450, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String inputText = input.getText();
        result.setText(new StringBuilder(inputText).reverse().toString());
    }

    public static void main(String[] args) {
        new ReverseString();
    }
}
