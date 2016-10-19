package circles;

public class Main {

    public static void main(String[] args) {
        Point centerA = new Point(0, 0);
        Circle circleA = new Circle(5, centerA);

        Point centerB = new Point(5, 5);
        Circle circleB = new Circle(4, centerB);

        try {
            int intersectionCount = circleA.getCirclesIntersectionCount(circleB);
            System.out.println(intersectionCount);
            System.out.println(circleA);
            System.out.println(circleB);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
