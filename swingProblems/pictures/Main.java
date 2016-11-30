package pictures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Graphics2D extends Canvas {

    private int index;
    private String[] paths;

    // пазим в масив адреса на снимките
    public Graphics2D() throws IOException {
        paths = new String[5];
        paths[0] = "src/pictures/esen1.png";
        paths[1] = "src/pictures/esen2.png";
        paths[2] = "src/pictures/esen3.png";
        paths[3] = "src/pictures/esen4.png";
        paths[4] = "src/pictures/esen5.png";
        index = 0;
    }

    @Override
    public void paint(Graphics g) {
        index++;

        // ако index е по-голям от 5 става 0 в противен случай не се променя
        index = index > paths.length - 1 ? 0 : index;
        Image img;
        try {
            img = ImageIO.read(new File(paths[index])); //четем снимката
            g.drawImage(img, 0, 0, this);
        } catch (IOException ex) {
            System.out.println("error reading files");
        }

        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);
        g.setColor(Color.RED);
        g.drawString("Есен в Родопите!", getWidth() / 2 - 100, getHeight() / 2 - 250);
        g.setColor(Color.BLACK);
        g.drawString("Картинка " + (index + 1), getWidth() / 2 - 100, getHeight() / 2 - 210);
        try {
            Thread.sleep(650);
        } catch (InterruptedException ex) {
            Logger.getLogger(Graphics2D.class.getName()).log(Level.SEVERE, null, ex);
        }

        repaint();
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }
}

public class Main {

    public static void main(String[] args) {
        JFrame windows = new JFrame("Kartinki Demo");
        windows.setSize(960, 640);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graphics2D canvas;
        try {
            canvas = new Graphics2D();
            windows.add(canvas);
            windows.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
