import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), offset = 100, result = 0;
        int[][] arr = new int[200][200];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset, y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset, y2 = sc.nextInt() + offset;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (arr[i][j] == 1) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}