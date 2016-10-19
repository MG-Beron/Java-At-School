package Triangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point getMiddlePoint(Point a, Point b) {
        int x = (a.getX() + b.getX())/ 2;
        int y = (a.getY() + b.getY())/ 2;

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}