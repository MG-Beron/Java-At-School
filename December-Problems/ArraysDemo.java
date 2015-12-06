package December;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 8};
        ArraysTest.min(arr);
        int[] reversedArr = ArraysTest.reverse(arr);

        for (int i = 0; i < reversedArr.length; i++) { //отпечаване на масива
            System.out.print(reversedArr[i] + " ");
        }
    }
}

class ArraysTest {
    static void min(int arr[]) { //логика за намиране на най-малкото число
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }

    static int[] reverse(int[] list) { //Логика за обръщане на реда на елементите в масива
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < result.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
