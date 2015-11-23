package November;

import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle m[] = new Rectangle[5]; //Декларираме масива

        int maxPerimeterIndex = 0;
        int maxPerimeter = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter m[" + i + "] side a and b -> ");
            int a = scanner.nextInt(); //Четем int от конзолата
            int b = scanner.nextInt();
            m[i] = new Rectangle(a,b);

            int currentPerimeter = m[i].getPerimeter(); //Текущ периметър
            if(maxPerimeter < currentPerimeter) { //търсим най-големия
                maxPerimeter = currentPerimeter;
                maxPerimeterIndex = i;
            }
        }

        System.out.println("The rectangle with largest perimeter is m[" + maxPerimeterIndex + "]" );
        System.out.println("The rectangle perimeter is -> " + maxPerimeter);
    }
}

class Rectangle {
    int a, b;

    public Rectangle(int firstSide, int secondSide) {
        a = firstSide;
        b = secondSide;
    }

    void printArea() {
        System.out.println("S = " + (a * b));
    }

    int getPerimeter() {
        return 2*(a + b);
    }
}

