
public class ArraysMaxAndMinNumber {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + (int)(Math.random() * 99);
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("max Number -> " + maxNumber);
        System.out.println("min Number -> " + minNumber);
    }
}
