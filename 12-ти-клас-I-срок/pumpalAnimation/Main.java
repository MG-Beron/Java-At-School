package pumpalAnimation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Graphics2D extends Canvas implements MouseListener {

    private int index;
    private String[] paths;
    private Boolean mouseExited = false;

    public Graphics2D() throws IOException {
        paths = new String[18];
        for (int i = 0; i < 18; i++) {
            paths[i] = "src/pumpalAnimation/images/tops" + i + ".gif";
        }
        index = 0;
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        if (mouseExited) {
            index = index - 1;
            if (index <= 0) {
                index = paths.length - 1;
            }
        } else {
            index = index + 1;
            if (index == paths.length - 1) {
                index = 0;
            }
        }

        Image img;
        try {
            img = ImageIO.read(new File(paths[index]));
            g.drawImage(img, 30, 30, 400, 200, this);
        } catch (IOException ex) {
            System.out.println("eror reading files");
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Graphics2D.class.getName()).log(Level.SEVERE, null, ex);
        }

        repaint();
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void mouseClicked(MouseEvent e) {
        mouseExited = !mouseExited;
        repaint();
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}

public class Main {

    public static void main(String[] args) {
        JFrame windows = new JFrame("Pumpal Demo");
        windows.setSize(500, 300);
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
