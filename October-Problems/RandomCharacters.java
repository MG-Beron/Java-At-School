public class RandomCharacters {

    public static void main(String[] args) {
        int vowelsCount = 0;

        for (int i = 1; i <= 100; i++) {
            char randomChar = (char)(Math.random()*26 + 65);
            if(randomChar == 'A' || randomChar == 'O' || randomChar == 'U'
                    || randomChar == 'E' || randomChar == 'I') {
                vowelsCount++;
            }

            System.out.print(randomChar + " ");
        }

        System.out.println();
        System.out.println("The vowels counts is: " + vowelsCount);
    }
}
