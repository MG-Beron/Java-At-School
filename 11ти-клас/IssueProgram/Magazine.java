package Issue;

public class Magazine extends Issue {
    public Magazine(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Magazine -> " + super.getName());
    }
}
