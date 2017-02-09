package triangle;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double calculateDistance(Point point) {
        double deltaX = this.x - point.getX();
        double deltaY = this.y - point.getY();

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return String.format("x=%d;y=%d", this.getX(), this.getY());
    }
}
