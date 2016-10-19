package Pet;

public class Pet {
    private String name;
    private int age;

    protected Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    // Презаписваме toString метода на класа
    // \n е нов ред
    public String toString() {
        return "------------" + "\n" +
                "Name -> " + this.name + "\n" +
                "Age -> " + this.age + "\n";
    }
}
