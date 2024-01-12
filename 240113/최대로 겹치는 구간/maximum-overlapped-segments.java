import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), offset = 100, maxVal = Integer.MIN_VALUE;
        int[] arr = new int[200];
        
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset, x2 = sc.nextInt() + offset;
            
            for (int j = x1; j <= x2 - 1; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < 200; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal);
    }
}