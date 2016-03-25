package Triangle;

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
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
        this.c = new Point(x3, y3);
    }

    // http://www.mathopenref.com/coordcentroid.html
    public Point getCentroid() {
        int mX = (a.getX() + b.getX() + c.getX())/ 3;
        int mY = (a.getY() + b.getY() + c.getY())/ 3;

        return new Point(mX, mY);
    }
}