package December;

public class TriangleTask {

    public static void main(String[] args) {
        Triangle arr[] = new Triangle[6]; //пробвай с 600

        int ravnostranenBroi = 0;
        int ravnobedrenBroi = 0;
        int raznostranenBroi = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = (int) (1 + Math.random() * 10); //рандом от 1 до 10
            int b = (int) (1 + Math.random() * 10);
            int c = (int) (1 + Math.random() * 10);

            if(a + b > c && a + c > b && b + c > a) {
                arr[i] = new Triangle(a, b, c);
            } else {
                i--;
                continue; //ще пропусне всичко отдолу и ще отиде в горе в цикъла
            }

            System.out.println("(a = " + a + " b = " + b + " c = " + c + ")");
            System.out.println("arr[" + i + "] -> " + arr[i].getType());
            System.out.println("====================================");
            String type = arr[i].getType();
            if(type.equals("ravnostranen")) {
                ravnostranenBroi++;
            } else if(type.equals("ravnobedren")) {
                ravnobedrenBroi++;
            } else if(type.equals("raznostranen")) {
                raznostranenBroi++;
            }
        }

        System.out.println("Ravnostrannite sa " + ravnostranenBroi + " broq");
        System.out.println("Ravnobedrenite sa " + ravnobedrenBroi + " broq");
        System.out.println("Raznostrannite sa " + raznostranenBroi + " broq");
    }
}

class Triangle {
    double a, b, c;

    Triangle(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    double calculateArea() {
        double p = Math.sqrt(a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    String getType() {
        if (a == b && b == c && a == c) {
            return "ravnostranen";
        } else if(a == b || b == c || a == c) {
            return "ravnobedren";
        } else {
            return "raznostranen";
        }
    }
}
