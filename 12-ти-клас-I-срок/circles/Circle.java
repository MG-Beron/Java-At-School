package circles;

public class Circle {

    private int radius;
    private Point centerPoint;

    public Circle(int radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public Circle() {
        this(0, new Point());
    }

    public int getRadius() {
        return this.radius;
    }

    public Point getCenterPoint() {
        return this.centerPoint;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    public int getCirclesIntersectionCount(Circle circle) {
        Point thisCenterPoint = this.getCenterPoint();
        Point otherCenterPoint = circle.getCenterPoint();

        double distanceBetweenRadiuses = thisCenterPoint.calculateDistance(otherCenterPoint);
        double radiusSum = this.getRadius() + circle.getRadius();

        if (distanceBetweenRadiuses == 0) {
            throw new IllegalArgumentException("The circles are identical");
        }

        if (distanceBetweenRadiuses == radiusSum) {
            return 1;
        } else if (distanceBetweenRadiuses < radiusSum) {
            return 2;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("radius = %d, center = [%s], perimeter = %.2f, area = %.2f",
                this.getRadius(), this.getCenterPoint(), this.getPerimeter(), this.getArea());
    }
}