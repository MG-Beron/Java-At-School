package targetgame;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame win = new JFrame("Target Game");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Target t=new Target();
        win.add(new Target());
        win.setVisible(true);
    }
}
