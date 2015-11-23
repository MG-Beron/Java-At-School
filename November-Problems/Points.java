package November;

public class Points {
    public static void main(String[] args) {
        CoordinatePoint points[] = new CoordinatePoint[10]; //Декларираме масива
        int kvadrant1Count = 0;
        int kvadrant2Count = 0;
        int kvadrant3Count = 0;
        int kvadrant4Count = 0;
        for (int i = 0; i < 10; i++) {
            int randomX = (int) (Math.random() * 101); //Произолно число от 0 до 100
            int randomY = (int) (Math.random() * 101);

            int signX = (int) (Math.random() * 2); //Произволно 0 или 1
            int signY = (int) (Math.random() * 2);

            if(signX == 1) { //Ако е 1 го правим с минус
                randomX = -randomX;
            }
            if(signY == 1) {
                randomY = -randomY;
            }

            points[i] = new CoordinatePoint(randomX, randomY); //правим обект с произволни х и у кординати
            System.out.println(i + " -> " + " x = " + randomX + " y = " + randomY);

            int location = points[i].getLocation(); //Метода връща 1 2 3 4 съответно в кой квадрант се намира
            if(location == 1) {
                kvadrant1Count++;
            } else if(location == 2) {
                kvadrant2Count++;
            } else if(location == 3) {
                kvadrant3Count++;
            } else if(location == 4) {
                kvadrant4Count++;
            }
        }

        System.out.println("------------------------------"); //След цикъла отпечатваме резултата
        System.out.println("1vi qvadrant broika -> " + kvadrant1Count);
        System.out.println("2ri qvadrant broika -> " + kvadrant2Count);
        System.out.println("3ti qvadrant broika -> " + kvadrant3Count);
        System.out.println("4ti qvadrant broika -> " + kvadrant4Count);
    }
}

class CoordinatePoint {
    int x, y;

    public CoordinatePoint(int k, int l) {
        x = k;
        y = l;
    }

    double rangeToCenter() {
        double rangeToCenter = Math.sqrt(x*x + y*y);

        return rangeToCenter;
    }

    int getLocation() {
        if(x > 0 && y > 0) {
            return 1;
        } else if(x < 0 && y > 0) {
            return 2;
        } else if(x < 0 && y < 0) {
            return 3;
        } else if(x > 0 && y < 0) {
            return 4;
        }

        return 0;
    }
}
