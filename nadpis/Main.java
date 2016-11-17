package nadpis;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame a = new JFrame();
        a.setSize(800,600);
        Canvas c = new Nadpis();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.add(c);
        a.setVisible(true);
    }
}
