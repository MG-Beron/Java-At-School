package triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    public String getTriangleType() {
        double sideA = this.a.calculateDistance(b);
        double sideB = this.b.calculateDistance(c);
        double sideC = this.c.calculateDistance(a);

        checkTriangleSides(sideA, sideB, sideC);

        if (sideA == sideB && sideA == sideC) {
            return "ravnostranen";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "ravnobedren";
        } else {
            return "raznostranen";
        }
    }

    public double getPerimeter() {
        double sideA = this.a.calculateDistance(b);
        double sideB = this.b.calculateDistance(c);
        double sideC = this.c.calculateDistance(a);

        checkTriangleSides(sideA, sideB, sideC);

        return sideA + sideB + sideC;
    }

    public double getArea() {
        double sideA = this.a.calculateDistance(b);
        double sideB = this.b.calculateDistance(c);
        double sideC = this.c.calculateDistance(a);

        checkTriangleSides(sideA, sideB, sideC);

        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private void checkTriangleSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle side must be positive");
        }

        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException("Triangle is invalid.");
        }
    }
}
