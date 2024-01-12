import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0;
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() - 1, x2 = sc.nextInt() - 1;

            for (int j = x1; j <= x2; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}