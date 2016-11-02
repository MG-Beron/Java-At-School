package randomTriangles;

import java.util.Random;

public class RandomTriangle {

    private Random rand;

    // Coordinates
    private int x1, y1;
    private int x2, y2;
    private int x3, y3;

    // Sides
    private double a;
    private double b;
    private double c;

    public RandomTriangle(int limit) {
        this.rand = new Random();
        do { // make sure that no points are on the same line
            x1 = rand.nextInt(limit);
            y1 = rand.nextInt(limit);

            x2 = rand.nextInt(limit);
            y2 = rand.nextInt(limit);

            x3 = rand.nextInt(limit);
            y3 = rand.nextInt(limit);
        } while (((x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1)));

        a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
    }

    public int[] getXCoordinates() {
        int[] coordinates = {this.x1, this.x2, this.x3};
        return coordinates;
    }

    public int[] getYCoordinates() {
        int[] coordinates = {this.y1, this.y2, this.y3};
        return coordinates;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public String getTriangleType() {
        if (this.a == this.b && this.a == this.c) {
            return "ravnostranen";
        } else if (this.a == this.b || this.a == this.c || this.b == this.c) {
            return "ravnobedren";
        } else {
            return "raznostranen";
        }
    }
}
