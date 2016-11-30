package drawCircleWithRadius;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvents extends Canvas implements MouseListener, MouseMotionListener {

    private int x = -1000;
    private int y = -1000;
    private int x1 = -1000;
    private int y1 = -1000;

    public MouseMotionEvents() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);

        double deltaX = x - x1;
        double deltaY = y - y1;
        int r = (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        g.fillOval(x - (r / 2), y - (r / 2), r, r);
    }

    public void mousePressed(MouseEvent evt) {
    }

    public void mouseClicked(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    public void mouseDragged(MouseEvent evt) {

    }

    public void mouseMoved(MouseEvent evt) {
        x1 = evt.getX();
        y1 = evt.getY();
        repaint();
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("MouseMotionEvents");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new MouseMotionEvents());
        win.setVisible(true);
    }
}