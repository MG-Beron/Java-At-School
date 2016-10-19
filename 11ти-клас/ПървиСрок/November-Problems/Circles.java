package November;

public class Circles {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, 3, 1);
        c1.printPerimeter();
        c1.printArea();

        Circle c2 = new Circle(-5, -4, 3);
        c2.printPerimeter();
        c2.printArea();

        double rangeBetweenCenters =
                Math.abs((c2.x - c1.x) * (c2.x - c1.x) + (c2.y - c1.y) * (c2.y - c1.y));
        if(rangeBetweenCenters < (c1.r + c2.r)) {
            System.out.println("The circles don't have same point.");
        } else if(rangeBetweenCenters == (c1.r + c2.r)) {
            System.out.println("The circles have one same point.");
        } else {
            System.out.println("The circles have two same points.");
        }

        if(c1.getRangeToCenter() < c2.getRangeToCenter()) {
            System.out.println("The first circle is nearer to the center.");
        } else if(c1.getRangeToCenter() == c2.getRangeToCenter()) {
            System.out.println("The circles range to center is equal.");
        } else {
            System.out.println("The second circle is nearer to the center.");
        }
    }

}

class Circle {
    int x, y, r;

    public Circle(int k, int l, int p) {
        x = k;
        y = l;
        r = p;
    }

    public void printArea() {
        System.out.println("S = " + r*r*Math.PI);
    }

    public void printPerimeter() {
        System.out.println("P = " + 2*r*Math.PI);
    }

    public double getRangeToCenter() {
        double rangeToCenter = Math.sqrt(x*x + y*y);

        return rangeToCenter;
    }
}
