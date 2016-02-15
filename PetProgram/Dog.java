package Pet;

public class Dog extends Pet {
    private String breed;
    private String fur;

    public Dog(String name, int age, String breed, String fur) {
        super(name, age); // извикваме конструктура на супер класа
        this.breed = breed;
        this.fur = fur;
    }

    // public get за да може да имаме достъп до breed
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        // Извикваме toString метод на супер класа и го допълваме
        return super.toString() +
                "Breed -> " + this.breed + "\n" +
                "Fur -> " + this.fur;
    }
}
