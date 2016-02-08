public class RandomPrimeCheck {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            int randomNumber = (int)(Math.random() * 100);
            Boolean isPrime = isNumberPrime(randomNumber);
            System.out.println("Is " + randomNumber  + " prime ? -> " + isPrime);
        }
    }

    private static Boolean isNumberPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
