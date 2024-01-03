import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] < 500 && arr[i] > maxVal) {
                maxVal = arr[i];
            } else if (arr[i] > 500 && arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}