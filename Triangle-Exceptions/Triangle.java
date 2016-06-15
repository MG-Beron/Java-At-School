package bg.mgberon.triangle;

/**
 * Клас триъгълник с 3 променливи за всяка страна
 * метод проверяващ дали 2 триъгълника са подобни
 * метод проверяващ дали 2 триъгълника са еднакви
 * private метод за проверка на валидност на страните
 * private метод за сортиране на масив
 *
 * @author Gyokan
 */
public class Triangle {
    // страни на триъгълника, променливи от реален тип double
    public double a;
    public double b;
    public double c;

    // Конструктор с 3 параметъра
    public Triangle(double a, double b, double c) {
        // проверка за валидност
        checkTriangleSides(a, b, c);

        // ако горния метод хвърли изключние, няма да се извика долния метод
        // метод, който задава стойности на променливите
        setSides(a, b, c);
    }

    // Конструктор с 2 параметъра
    public Triangle(double a, double b) {
        // обръщаме се към първия конструктор (равнобедрен триъгълник)
        this(a, b, b);
    }

    // Конструктор с 3 параметъра
    public Triangle(double a) {
        // обръщаме се към първия конструктор (равностранен триъгълник)
        this(a, a, a);
    }

    /**
     * Сравнява отношенията на страните
     *
     * @param triangle подаден обект за сравнение
     * @return true при подобност, false в противен случай
     */
    public boolean isSimilarTo(Triangle triangle) {
        double a1 = this.a / triangle.a;
        double b1 = this.b / triangle.b;
        double c1 = this.c / triangle.c;

        return a1 == b1 && a1 == c1 && b1 == c1;
    }

    /**
     * Проверява за еднаквост на страните
     *
     * @param triangle подаден обект за сравнение
     * @return true при еднаквост, false в противен случай
     */
    public boolean isSameTo(Triangle triangle) {
        return this.a == triangle.a && this.b == triangle.b && this.c == triangle.c;
    }

    /**
     * Сортира страните с помощта на трета променлива
     * задава сортираните стойности на променливите (полетата)
     *
     * @param a страната А
     * @param b страната В
     * @param c страната C
     */
    private void setSides(double a, double b, double c) {
        double exchangeValue;
        if (b > a) {
            exchangeValue = a;
            a = b;
            b = exchangeValue;
        }
        if (c > a) {
            exchangeValue = a;
            a = c;
            c = exchangeValue;
        }
        if (c > b) {
            exchangeValue = b;
            b = c;
            c = exchangeValue;
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Проверява дали страните на триъгълника са положителни
     * Проверява дали страните на триъгълниак са валидни
     * мята IllegalArgumentException със съобщение
     * при мятане на изкючение програма спира
     *
     * @param a страна А
     * @param b страна В
     * @param c страна C
     */
    private void checkTriangleSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle side must be positive");
        }

        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException("Triangle is invalid.");
        }
    }
}
