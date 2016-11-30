package sierpinskiTriangle;

import java.awt.*;

public class CustomGraphics extends Canvas {

    @Override
    public void paint(Graphics g) {
        Point pointA = new Point(512, 109);
        Point pointB = new Point(146, 654);
        Point pointC = new Point(876, 654);
        Point currPoint = new Point(512, 382);

        g.setColor(Color.BLACK);
        for (int i = 0; i < 50000; i++) {
            g.drawLine(currPoint.getX(), currPoint.getY(), currPoint.getX(), currPoint.getY());

            int dx = 0;
            int dy = 0;
            int number = 1 + (int) (Math.random() * 3);
            if (number == 1) {
                dx = currPoint.getX() - pointA.getX();
                dy = currPoint.getY() - pointA.getY();
            } else if (number == 2) {
                dx = currPoint.getX() - pointB.getX();
                dy = currPoint.getY() - pointB.getY();
            } else if (number == 3) {
                dx = currPoint.getX() - pointC.getX();
                dy = currPoint.getY() - pointC.getY();
            }
            currPoint.setX(currPoint.getX() - dx / 2);
            currPoint.setY(currPoint.getY() - dy / 2);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        g.drawString("Sierpinski Triangle", 462, 484);
    }
}
