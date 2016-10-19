public class TwoSameDigits500To600 {
    
    public static void main(String[] args) {

        int count = 0;
        for (int i = 500; i <= 600; i++) {

            int ones = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100 % 10;

            if (ones == tens || ones == hundreds || tens == hundreds){
                count++;
                System.out.printf("\nNumber %d -> %d", count, i);
            }
        }
    }
}
