package November;

public class Points {
    public static void main(String[] args) {
        CoordinatePoint point1 = new CoordinatePoint(2, 3);
        point1.printQuadrantLocation();

        CoordinatePoint point2 = new CoordinatePoint(-2, -4);
        point2.printQuadrantLocation();

        if(point1.rangeToCenter() < point2.rangeToCenter()) {
            System.out.println("The first point is near to the center.");
        } else if(point1.rangeToCenter() > point2.rangeToCenter()){
            System.out.println("The second points in near to the center.");
        } else {
            System.out.println("The distance is equal.");
        }
    }
}

class CoordinatePoint {
    int x, y;

    public CoordinatePoint(int k, int l) {
        x = k;
        y = l;
    }

    public double rangeToCenter() {
        double rangeToCenter = Math.sqrt(x*x + y*y);

        return rangeToCenter;
    }

    public void printQuadrantLocation() {
        if(x > 0 && y > 0) {
            System.out.println("First quadrant.");
        } else if(x < 0 && y > 0) {
            System.out.println("Second quadrant.");
        } else if(x < 0 && y < 0) {
            System.out.println("Third quadrant.");
        } else if(x > 0 && y < 0) {
            System.out.println("Fourth quadrant.");
        }
    }
}
