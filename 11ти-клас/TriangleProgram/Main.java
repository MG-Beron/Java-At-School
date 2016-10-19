package Triangle;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(5, 15);
        Point c = new Point(25, 10);

        System.out.println("Point a -> " + a);
        System.out.println("Point b -> " + b);
        System.out.println("Point c -> " + c);

        System.out.println("Center point a and b -> " + Point.getMiddlePoint(a, b));
        System.out.println("Center point b and c -> " + Point.getMiddlePoint(b, c));
        System.out.println("Center point b and c -> " + Point.getMiddlePoint(a, c));

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Centroid -> " + triangle.getCentroid());

        Triangle triangle2 = new Triangle(0, 0, 5, 15, 25, 10);
        System.out.println("Centroid -> " + triangle2.getCentroid());
    }
}