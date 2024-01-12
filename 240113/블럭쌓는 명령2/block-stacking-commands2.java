import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), maxVal = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal);
    }
}