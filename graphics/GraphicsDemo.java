package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsDemo extends Canvas {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 10, 150, 50);
        g.setColor(Color.GREEN);
        g.fillRect(0, 60, 150, 50);
        g.setColor(Color.RED);
        g.fillRect(0, 110, 150, 50);

        g.setColor(Color.BLACK);
        g.fillRect(0, 250, 200, 100);
        g.setColor(Color.WHITE);
        g.fillRect(25, 275, 150, 50);

        drawCircles(g);

        g.setColor(Color.BLACK);
        g.drawPolygon(new int[]{444, 464, 355}, new int[]{222, 22, 122}, 3);
    }

    private void drawCenteredCircle(Graphics g, int x, int y, int r) {
        x = x - (r / 2);
        y = y - (r / 2);
        g.fillOval(x, y, r, r);
    }

    private void drawCircles(Graphics g) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.WHITE);
                drawCenteredCircle(g, 600, 300, 200 - i * 10);
            } else {
                g.setColor(Color.BLACK);
                drawCenteredCircle(g, 600, 300, 200 - i * 10);
            }
        }
    }

}
