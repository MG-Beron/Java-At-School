public class Truck extends Vehicle {

    // private променливи(достъп само в рамките на този клас)
    private int cargo; // товароподемност?

    public Truck(int wheelsCount, int weight, int cargo) {
        super(wheelsCount, weight); //извикваме конструктура на супер класа и му подаваме параметри
        this.cargo = cargo;
    }

    // get и set методи
    // когато обектните променливи са Private чрез тези методи можем да им задавме стойности и да ги взимамее
    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    // Override на метода от супер класа с цел разширение
    @Override
    public void show() {
        super.show(); // извикваме метод от супер класа
        System.out.println("Max cargo -> " + this.cargo);
    }
}
