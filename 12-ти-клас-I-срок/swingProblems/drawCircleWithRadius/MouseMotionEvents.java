package drawCircleWithRadius;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvents extends Canvas implements MouseListener, MouseMotionListener {

    private int x = -1;
    private int y = -1;
    private int x1 = -1;
    private int y1 = -1;

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
        if (x != -1) {
           // g.fillOval(x - r, y - r, r * 2, r * 2);
            g.drawOval(x - r, y - r, r * 2, r * 2);
        }
    }

    public void mousePressed(MouseEvent evt) {

    }

    public void mouseClicked(MouseEvent evt) {
        this.x = evt.getX();
        this.y = evt.getY();
    }

    public void mouseReleased(MouseEvent evt) {

    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    public void mouseDragged(MouseEvent evt) {

    }

    public void mouseMoved(MouseEvent evt) {
        this.x1 = evt.getX();
        this.y1 = evt.getY();
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