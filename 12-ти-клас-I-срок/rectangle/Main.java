package rectangle;

    // http://www.mathopenref.com/coordrectareaperim.html

public class Main {

    public static void main(String[] args) {

        Point first = new Point(-2,2);
        Point second = new Point(2,-2);
        Rectangle rect = new Rectangle(1,1,2,2);

        System.out.println(first.distance(second));
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(rect.toString());
        System.out.println(rect.area());
        System.out.println(rect.diagonal());
        }
}
