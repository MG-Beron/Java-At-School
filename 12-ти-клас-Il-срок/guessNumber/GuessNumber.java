import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame implements ActionListener {

    private int randomNumber;
    private JTextField numberGuess;
    private JButton button;
    private JLabel result;

    public GuessNumber() {
        randomNumber = 10 + (int)(Math.random() * (90));

        setLayout(new FlowLayout());

        numberGuess = new JTextField(5);
        button = new JButton("Enter");
        result = new JLabel(" ");

        button.addActionListener(this);

        add(numberGuess);
        add(button);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Guess Number");
        setSize(250, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(numberGuess.getText());
        if (num == randomNumber) {
            result.setText("You win!");
        } else if (num < randomNumber) {
            result.setText("Your number is smaller");
        } else if (num > randomNumber) {
            result.setText("Your number is bigger");
        }
    }

    public static void main(String[] args) {
        new GuessNumber();
    }
}
