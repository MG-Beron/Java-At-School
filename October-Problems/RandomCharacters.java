public class RandomCharacters {

    public static void main(String[] args) {
        int vowelsCount = 0;
        String vowels = "AEOIU";

        for (int i = 1; i <= 100; i++) {
            Character randomChar = (char)(Math.random()*26 + 65);
            if(Character.toString(randomChar).contains(vowels)) {
                vowelsCount++;
            }

            System.out.print(randomChar + " ");
        }

        System.out.println();
        System.out.println("The vowels counts is: " + vowelsCount);
    }
}