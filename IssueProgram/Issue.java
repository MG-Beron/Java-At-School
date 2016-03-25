package Issue;

public abstract class Issue {
    private String name;

    protected Issue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Issue");
    }
}