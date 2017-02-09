package targetgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Target extends Canvas implements MouseListener,MouseMotionListener{
    
    public boolean isGuessed=false;
        int mX;
        int mY;

        int tX = 0 + (int)(Math.random() * (768-400));
        int tY = 0 + (int)(Math.random() * (1024-400));
        int dist;

           public Target() {
        addMouseListener(this);
        addMouseMotionListener(this);
           }

    public void paint(Graphics g){
        g.setColor(Color.red);

        if(isGuessed){
            g.fillOval(tX, tY, 100, 100);
        }
        g.setColor(Color.blue);
        g.drawString(String.valueOf(dist), mX, mY);
    }

    public void mouseClicked(MouseEvent e) {    
    }

    public void mousePressed(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();
        dist=(int)(Math.sqrt(((mX-tX-50)*(mX-tX-50)+(mY-tY-50)*(mY-tY-50))));
        if(dist<=50){
        isGuessed=true;
        }
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }
}
