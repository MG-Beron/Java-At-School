package Issue;

public class Main {
    public static void main(String[] args) {
        Issue catalog[] = new Issue[5];
        catalog[0] = new Book("Pod Igoto");
        catalog[1] = new Magazine("Car and driver");
        catalog[2] = new Magazine("Forbes");
        catalog[3] = new Newspaper("24 chasa");
        catalog[4] = new Newspaper("Trud");

        for (int i = 0; i < catalog.length; i++) {
            catalog[i].print();
        }
    }
}
