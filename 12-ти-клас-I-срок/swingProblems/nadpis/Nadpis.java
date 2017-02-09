package nadpis;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Nadpis extends Canvas {
    private String s = "Hello World !";
    private char x;

    @Override
    public void paint(Graphics g) {
       setBackground(Color.YELLOW);
       g.setColor(Color.RED);
       Font f = new Font("Tahoma", Font.BOLD, 25);
       g.setFont(f);
       g.drawString(s, 100, 50);
       x = s.charAt(0);
       s = s.substring(1) + x;
       try  {
           Thread.sleep(200);
       } catch (InterruptedException ex) {
           System.out.println("Thread exception");
       }
       
        repaint();
    }

    /*
    This piece of code doesn't delete the previous paint;
     */
//    @Override
//    public void update(Graphics g) {
//        paint(g);
//    }
}
