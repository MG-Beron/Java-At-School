package triangle;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(10, 0);
        Point c = new Point(5, 20);

        try {
            Triangle triangle = new Triangle(a, b, c);
            String type = triangle.getTriangleType();
            double perimeter = triangle.getPerimeter();
            double area = triangle.getArea();

            System.out.println(type);
            System.out.println(perimeter);
            System.out.println(area);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
