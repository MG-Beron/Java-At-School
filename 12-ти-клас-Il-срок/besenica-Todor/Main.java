/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package besenica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JTextField input;
    JTextField answer;
    JTextField hint;
    JButton update;
    String in;
    String Word;
    String answer_string;
    int First_Time = 1;


    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        setLayout(new FlowLayout());

        input = new JTextField("", 20);
        add(input);

        answer = new JTextField("Enter your word in the field above", 20);
        add(answer);

        update = new JButton("Update");
        update.addActionListener(this);
        add(update);

        hint = new JTextField("", 20);
        add(hint);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Get real");
        setSize(300, 160);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == update) {

            if (First_Time == 1) {
                First_Time = 0;
                Word = input.getText();
                hint.setText(Word);
                StringBuilder stringBuilder = new StringBuilder();
                for (int a = 0; a < Word.length(); a++) {
                    stringBuilder.append("*");
                }
                answer_string = stringBuilder.toString();
                answer.setText(answer_string);
                return;
            }

            in = input.getText();

            if (in.equals(Word)) {
                answer.setText("You are right!");
                return;
            } else {

                if (in.length() != 1) {
                    answer.setText("Wrong answer");
                    return;
                }
            }

            for (int a = 0; a < Word.length(); a++) {
                if (Word.charAt(a) == in.charAt(0)) {
                    StringBuilder myName = new StringBuilder(answer_string);
                    myName.setCharAt(a, in.charAt(0));
                    answer_string = myName.toString();
                }
            }

            answer.setText(answer_string);
        }
    }

}
