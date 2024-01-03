import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxVal = Integer.MIN_VALUE, idx = 0, secondVal = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                idx = i;
            }
        }

        arr[idx] = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondVal) {
                secondVal = arr[i];
            }
        }

        System.out.printf("%d %d", maxVal, secondVal);
    }
}