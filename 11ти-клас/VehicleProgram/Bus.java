public class Bus extends Vehicle {

    // private променливи(достъп само в рамките на този клас)
    private int passengers;
    private int maxPassengers;

    public Bus(int wheelsCount, int weight, int passengers, int maxPassengers) {
        super(wheelsCount, weight); //извикваме конструктура на супер класа и му подаваме параметри
        this.passengers = passengers;
        this.maxPassengers = maxPassengers;
    }

    // get и set методи
    // когато обектните променливи са Private чрез тези методи можем да им задавме стойности и да ги взимамее
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Override на метода от супер класа с цел разширение
    @Override
    public void show() {
        super.show(); // извикваме метод от супер класа
        System.out.println("Passengers -> " + this.passengers);
        System.out.println("Max passengers -> " + this.maxPassengers);

        // изпозлваме метода за да проверим дали е вярно или грешно условието
        if(checkPassengersCount()) {
            System.out.println("The bus has empty seats.");
        } else {
            System.out.println("The bus has not empty seats.");
        }
    }

    // Private метод който проверява дали свободните места са свършили
    // този метод може да бъде използван само в рамките на този клас
    // не може да бъде извикан от друг клас
    private boolean checkPassengersCount() {
        return this.passengers <= this.maxPassengers;
    }
}
