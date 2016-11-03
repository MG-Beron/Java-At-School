package graphics;

import javax.swing.*;

public class Main {

public static int width=840;
public static int height=560;
    
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new GraphicsDemo());
        window.setVisible(true);
    }

}
