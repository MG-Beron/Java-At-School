package Issue;

public class Newspaper extends Issue {
    public Newspaper(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Newspaper -> " + super.getName());
    }
}