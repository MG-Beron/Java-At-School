public class Vehicle {

    // private променливи(достъп само в рамките на този клас)
    private int wheelsCount;
    private int weight;

    // protected конструктор(достъп имат само подкласовете)
    protected Vehicle(int wheelsCount, int weight) {
        this.wheelsCount = wheelsCount; // с this се обръщаме към променливите горе
        this.weight = weight;
    }

    // припер за get и set методи
    // когато обектните променливи са Private чрез тези методи можем да им задавме стойности и да ги взимамее
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    // public метод(достъп и от други класове)
    public void show() {
        System.out.println("------------------");
        System.out.println("Wheels count -> " + this.wheelsCount);
        System.out.println("Weight -> " + this.weight);
    }
}
