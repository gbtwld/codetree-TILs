import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxNum = 0;
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1 2 3 5 7 8

        Arrays.sort(arr);

        for (int i = 0; i < 2 * n; i++) {
            if (arr[i] + arr[2 * n - 1 - i] > maxNum) {
                maxNum = arr[i] + arr[2 * n - 1 - i];
            }
        }

        System.out.print(maxNum);
    }
}