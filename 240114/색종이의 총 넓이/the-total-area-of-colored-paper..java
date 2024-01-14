import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), offset = 100, result = 0;
        int[][] arr = new int[200][200];
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() + offset, y = sc.nextInt() + offset;

            for (int j = x; j < x + 8; j++) {
                for (int k = y; k < y + 8; k++) {
                    arr[j][k]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}