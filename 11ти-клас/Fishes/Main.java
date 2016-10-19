package Fishes;

public class Main {
    private final static int NUM = 4;
    public static void main(String[] args) {
        Fish[] f = new Fish[NUM];

        f[0] = new Trout(); // пъстърва
        f[1] = new Flounder(); // камбала
        f[2] = new Tuna(); // риба тон
        f[3] = new Trout();

        for (int i = 0; i < NUM; i++) {
            if (f[i] instanceof SaltWaterFish) {
                f[i].show();
            }
        }
    }
}

abstract class Fish {
    abstract void show();
}

abstract class SaltWaterFish extends Fish {

}

abstract class FreshWaterFish extends Fish {

}

class Trout extends FreshWaterFish{
    public void show() {
        System.out.println("Trout");
    }
}

class Flounder extends SaltWaterFish {
    public void show() {
        System.out.println("Flounder");
    }
}

class Tuna extends SaltWaterFish {
    public void show() {
        System.out.println("Tuna");
    }
}