package Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Масив от 5 кучета
        Dog dog[] = new Dog[5];
        dog[0] = new Dog("Sharo", 3, "German shepherd", "White");
        dog[1] = new Dog("Puhco", 2, "Ulichna prevyzhodna", "Brown");
        dog[2] = new Dog("Tomi", 3, "German shepherd", "Black");
        dog[3] = new Dog("Malcho", 5, "Chihuahua", "White");
        dog[4] = new Dog("Zahapkata", 9, "Doberman", "Black and white");

        System.out.print("Enter breed -> ");
        // четем стринг от конзолата
        String breed = sc.nextLine();
        for (int i = 0; i < dog.length; i++) {
            // проверяваме дали породата на куче и стринга съвпада
            if(breed.equals(dog[i].getBreed())) {
                System.out.println(dog[i]);
            }
        }
    }
}