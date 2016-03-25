package Issue;

public class Book extends Issue {
    public Book(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Book -> " + super.getName());
    }
}
