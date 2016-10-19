package rectangle;

public class Main {

    // http://www.mathopenref.com/coordrectareaperim.html
    public static void main(String[] args) {
        Point a = new Point(10, 26);
        Point b = new Point(45, 10);

        Rectangle rectangle = new Rectangle(a, b);
        double perimeter = rectangle.getPerimeter();
        double area = rectangle.getArea();

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}