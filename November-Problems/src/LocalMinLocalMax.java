import java.util.Scanner;

public class LocalMinLocalMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]){
                System.out.println("Local minimum -> " + arr[i]);
            }
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                System.out.println("Local maximum -> " + arr[i]);
            }
        }
    }
}
