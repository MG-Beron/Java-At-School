package rectangle;

public class Rectangle {

    private Point a;
    private Point b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getPerimeter() {
        double sideA = Math.abs(this.a.getX() - this.b.getX());
        double sideB = Math.abs(this.a.getY() - this.b.getY());

        return 2 * (sideA + sideB);
    }

    public double getArea() {
        double sideA = Math.abs(this.a.getX() - this.b.getX());
        double sideB = Math.abs(this.a.getY() - this.b.getY());

        return sideA * sideB;
    }
}