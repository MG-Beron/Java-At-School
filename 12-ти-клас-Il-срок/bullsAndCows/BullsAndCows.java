package bullsAndCows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BullsAndCows extends JFrame implements ActionListener {

    int secretNumber = 1234;
    JLabel label;
    JTextField guessInput;
    JButton enterBtn;
    JLabel output;

    public BullsAndCows() {
        setLayout(new FlowLayout());

        label = new JLabel("Enter 4-digit number: ");
        guessInput = new JTextField(5);
        enterBtn = new JButton("Enter guess");
        output = new JLabel("");

        enterBtn.addActionListener(this);

        add(label);
        add(guessInput);
        add(enterBtn);
        add(output);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bulls and Cows");
        setSize(350, 120);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        int guessNum = Integer.parseInt(guessInput.getText());

        int bulls = 0;
        int cows = 0;

        int guess1 = (guessNum / 1000) % 10;
        int guess2 = (guessNum / 100) % 10;
        int guess3 = (guessNum / 10) % 10;
        int guess4 = guessNum % 10;

        int d1 = (secretNumber / 1000) % 10;
        int d2 = (secretNumber / 100) % 10;
        int d3 = (secretNumber / 10) % 10;
        int d4 = secretNumber % 10;

        
        // Find all bulls, count them and remove them (assign -1 and -2)
        if (d1 == guess1) {
            bulls++;
            guess1 = -1;
            d1 = -2;
        }
        if (d2 == guess2) {
            bulls++;
            guess2 = -1;
            d2 = -2;
        }
        if (d3 == guess3) {
            bulls++;
            guess3 = -1;
            d3 = -2;
        }
        if (d4 == guess4) {
            bulls++;
            guess4 = -1;
            d4 = -2;
        }

        if (d1 == guess2) {
            cows++;
            guess2 = -1;
        } else if (d1 == guess3) {
            cows++;
            guess3 = -1;
        } else if (d1 == guess4) {
            cows++;
            guess4 = -1;
        }

        if (d2 == guess1) {
            cows++;
            guess1 = -1;
        } else if (d2 == guess3) {
            cows++;
            guess3 = -1;
        } else if (d2 == guess4) {
            cows++;
            guess4 = -1;
        }

        if (d3 == guess1) {
            cows++;
            guess1 = -1;
        } else if (d3 == guess2) {
            cows++;
            guess2 = -1;
        } else if (d3 == guess4) {
            cows++;
            guess4 = -1;
        }

        if (d4 == guess1) {
            cows++;
            guess1 = -1;
        } else if (d4 == guess2) {
            cows++;
            guess2 = -1;
        } else if (d4 == guess3) {
            cows++;
            guess3 = -1;
        }
        
        if (bulls == 4) {
            output.setText("You win the number is: " + secretNumber);
        } else {
            output.setText(String.format("%s bulls %s cows! Try Again ;(", bulls, cows));
        }
    }

    public static void main(String[] args) {
        new BullsAndCows();
    }
}
