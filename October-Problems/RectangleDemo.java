public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.sideA = 5;
        rect1.sideB = 7;
        rect1.printArea();
        rect1.printPerimeter();

        Rectangle rect2;
        rect2 = new Rectangle();
        rect2.sideA = 4;
        rect2.sideB = 7;
        rect2.printArea();
        rect2.printPerimeter();
    }
}

class Rectangle {
    int sideA, sideB;
    void printArea() {
        System.out.println("S = " + (sideA * sideB));
    }
    void printPerimeter() {
        System.out.println("P = " + (2* (sideA + sideB)));
    }
}