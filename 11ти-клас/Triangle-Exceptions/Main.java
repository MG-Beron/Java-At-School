package bg.mgberon.triangle;

public class Main {

    public static void main(String[] args) {
        // try catch блок
        try {
            // създаване на 2 триъгълника
            Triangle abc = new Triangle(3, 4, 5);
            Triangle def = new Triangle(10, 8, 6);

            // опитай с различни стойности за различни случаи.
//            def = new Triangle(3);
//            def = new Triangle(3,4);
//            def = new Triangle(123, -123, 0);
//            def = new Triangle(1, 2, 3);

            boolean isSimilar = abc.isSimilarTo(def);
            boolean isSame = abc.isSameTo(def);

            System.out.println("Is similar -> " + isSimilar);
            System.out.println("Is same -> " + isSame);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
