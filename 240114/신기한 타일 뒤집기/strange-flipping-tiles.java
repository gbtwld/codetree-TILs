import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cur = 50000;
        int[] arr = new int[100000];
        int w = 0, k = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int j = 0; j < num; j++) {
                    arr[cur - j] = 1;
                }
                cur = cur - num + 1;
            } else {
                for (int j = 0; j < num; j++) {
                    arr[cur + j] = 2;
                }
                cur = cur + num - 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                w++;
            } else if (arr[i] == 2) {
                k++;
            }
        }

        System.out.printf("%d %d", w, k);
    }
}