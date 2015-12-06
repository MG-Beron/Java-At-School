package December;

public class Tochki {
    public static void main(String[] args) {
        Point points[] = new Point[10];

        double min = 10000000;
        int minIndex = 0;

        for (int i = 0; i < 10; i++) {
            int randomX = (int) (Math.random() * 101);
            int randomY = (int) (Math.random() * 101);

            int signX = (int) (Math.random() * 2);//returns 0 or 1
            int signY = (int) (Math.random() * 2);

            if(signX == 1) { //if the number is 1 make the sign negative
                randomX = -randomX;
            }
            if(signY == 1) {
                randomY = -randomY;
            }

            points[i] = new Point(randomX, randomY);
            System.out.printf("points[%d] => {x = %d, y = %d}\n", i, randomX, randomY);

            if(min > points[i].calculateRangeToCenter()) {
                min = points[i].calculateRangeToCenter();
                minIndex = i;
            }
        }

        System.out.println("Nai-blizkata tochka do (0,0) e points[" + minIndex + "]");
        Point.printMaxDistance(points);
    }
}

class Point {
    int x, y;

    public Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    double calculateRangeToCenter() {
        return Math.sqrt(x*x + y*y);
    }

    double calculateRangeBetweenTwoPoints(Point p) {
        double deltaX = (p.x - x) * (p.x - x);
        double deltaY = (p.y - y) * (p.y - y);

        return Math.sqrt(deltaX + deltaY);
    }

    static void printMaxDistance(Point[] arr) {
        double maxDistance = 0;
        int maxDistanceIndexI = 0;
        int maxDistanceIndexJ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <arr.length; j++) {
                double currentDistance = arr[i].calculateRangeBetweenTwoPoints(arr[j]);
                if(currentDistance > maxDistance) {
                    maxDistance = currentDistance;
                    maxDistanceIndexI = i;
                    maxDistanceIndexJ = j;
                }
            }
        }

        System.out.printf("Raztoqnieto mejdu points[%d] i points[%d] e nai-golqmo.",
                maxDistanceIndexI, maxDistanceIndexJ);
    }
}


