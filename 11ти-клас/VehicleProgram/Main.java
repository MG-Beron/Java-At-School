public class Main {
    public static void main(String[] args) {
        // инициализиране на обектите чрез техния конструктор
        Bus bus = new Bus(4, 6000, 25, 32);
        Truck truck = new Truck(12, 12000, 25000);

        // извикване на публичните методи на обектите
        bus.show();
        truck.show();
    }
}
