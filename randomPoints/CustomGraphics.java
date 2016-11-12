package randomPoints;

import java.awt.*;

public class CustomGraphics extends Canvas {

    private static int LIMIT = 1000;

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < LIMIT; i++) {
            int x = (int) (Math.random() * super.getWidth());
            int y = (int) (Math.random() * super.getHeight());

            Color c = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(c);
            g.fillOval(x, y, 10, 10);
        }
    }
}
