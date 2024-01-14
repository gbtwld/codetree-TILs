import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2000][2000];
        int offset = 1000, result = 0;
        
        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt() + offset, y1 = sc.nextInt() + offset, x2 = sc.nextInt() + offset, y2 = sc.nextInt() + offset;
            
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i < 2) {
                        arr[j][k]++;
                    } else {
                        arr[j][k]--;
                    }
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