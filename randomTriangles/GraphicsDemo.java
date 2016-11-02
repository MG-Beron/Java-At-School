package randomTriangles;

import java.awt.*;

public class GraphicsDemo extends Canvas {

    @Override
    public void paint(Graphics g) {
        RandomTriangle myTriangle = new RandomTriangle(450);
        int[] x = myTriangle.getXCoordinates();
        int[] y = myTriangle.getYCoordinates();

        g.setColor(Color.RED);
        g.fillPolygon(x, y, 3);

        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g.drawString(String.format("Area: %.2f", myTriangle.getArea()), 0, 30);
        g.drawString(String.format("Perimeter: %.2f", myTriangle.getPerimeter()), 0, 60);
        g.drawString(String.format("Type: %s", myTriangle.getTriangleType()), 0, 90);
    }
}