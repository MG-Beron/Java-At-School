package drawLines;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Main extends Canvas implements MouseListener, MouseMotionListener {

    private int x = 0;
    private int y = 0;
    private int x1 = 0;
    private int y1 = 0;
    private Boolean mouseExited = false;

    public Main() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(x, y, x1, y1);
        if (this.mouseExited) {
            g.clearRect(0, 0, getWidth(), getHeight());
            mouseExited = false;
        }
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void mousePressed(MouseEvent evt) {
        x1 = x;
        y1 = y;
        x = evt.getX();
        y = evt.getY();
    }

    public void mouseClicked(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
        mouseExited = true;
        repaint();
    }

    public void mouseDragged(MouseEvent evt) {
        x1 = x;
        y1 = y;
        x = evt.getX();
        y = evt.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Drawing Lines");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Main());
        win.setVisible(true);
    }
}
