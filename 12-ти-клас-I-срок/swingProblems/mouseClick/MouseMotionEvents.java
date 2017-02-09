import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvents extends Canvas implements MouseListener, MouseMotionListener {

    private int x = -100;
    private int y = -100;
    private int r = 50;

    public MouseMotionEvents() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x - (r / 2), y - (r / 2), r, r);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void mousePressed(MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
        repaint();
    }

    public void mouseClicked(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    public void mouseDragged(MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent evt) {
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("MouseMotionEvents");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new MouseMotionEvents());
        win.setVisible(true);
    }
}