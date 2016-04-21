package Mammals;

public class Demo {
    public final static int NUM = 4;
    public static void main(String[] args) {
        Mammal[] m = new Mammal[NUM];

        m[0] = new Bear();
        m[1] = new Elephant();
        m[2] = new Horse();
        m[3] = new Lion();

        for(int i = 0; i < NUM; i++) {
            if (m[i] instanceof Vehicle) {
                Vehicle v = (Vehicle) m[i];
                v.drive();
            }
        }
    }
}
