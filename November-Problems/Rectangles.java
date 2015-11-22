package November;

public class Rectangles {
    public static void main(String[] args) {
        Rectangle smallRect = new Rectangle(2, 3);
        smallRect.printArea();
        smallRect.printPerimeter();

        Rectangle largeRect = new Rectangle(15, 20);
        largeRect.printArea();
        largeRect.printPerimeter();
    }
}

class Rectangle {
    int a, b;

    public Rectangle(int firstSide, int secondSide) {
        a = firstSide;
        b = secondSide;
    }

    public void printArea() {
        System.out.println("S = " + (a * b));
    }
    public void printPerimeter() {
        System.out.println("P = " + 2*(a + b));
    }
}

