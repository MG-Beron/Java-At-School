package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();
            shapes[i].draw();
        }
    }

    private static Shape getRandomShape() {
        switch ((int) (Math.random() * 3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return null;
        }
    }
}

abstract class Shape {
    void draw() {
    }

    void erase() {
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Square draw");
    }

    public void erase() {
        System.out.println("Square erase");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle draw");
    }

    public void erase() {
        System.out.println("Circle erase");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle draw");
    }

    public void erase() {
        System.out.println("Triangle erase");
    }
}