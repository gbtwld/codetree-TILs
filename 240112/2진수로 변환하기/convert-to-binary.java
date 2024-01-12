import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100000];
        int n = sc.nextInt(), cnt = 0;

        while (true) {
            if (n < 2) {
                arr[cnt++] = n;
                break;
            }

            arr[cnt++] = n % 2;
            n /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}