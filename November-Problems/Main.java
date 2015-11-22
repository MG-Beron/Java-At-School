package November;

public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle(4, 5);
        System.out.println("c = " + tr.getHypotenuse());

        tr.printPerimeter();
        tr.printArea();
    }
}

class Triangle {
    double a, b;

    public Triangle(double k, double l) {
        a = k;
        b = l;
    }

    public void printArea() {
        System.out.println("S = " + (a*b)/2);
    }

    public double getHypotenuse() {
        double c = Math.sqrt(a*a + b*b);
        return c;
    }

    public void printPerimeter() {
        System.out.println("P = " + (a+b+ getHypotenuse()));
    }
}