package clockwiseLine;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClockwiseLine extends Canvas {

    private int x = 0;
    private int y = 0;
    private int counter = 0;
    @Override
    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        g.setColor(Color.RED);
        Font f = new Font("Tahoma", Font.BOLD, 25);
        g.setFont(f);

        if (x <= this.getWidth() && y <= 0) {
            x++;
        } else if (x >= this.getWidth() && y < this.getHeight()) {
            y++;
        } else if (x > 0 && y >= this.getHeight()) {
            x--;
        } else if (x <= 0 && y > 0) {
            y--;
        }

        g.drawString("x = " + x, 10, 25);
        g.drawString("y = " + y, 10, 50);
        g.drawLine(x, y, this.getWidth() / 2, this.getHeight() / 2);

        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClockwiseLine.class.getName()).log(Level.SEVERE, null, ex);
        }

        repaint();
    }

//    @Override
//    public void update(Graphics g) {
//        paint(g);
//    }
}
