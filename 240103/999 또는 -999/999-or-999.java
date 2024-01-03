import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE, n, cnt = 0;

        for (int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if (n == 999 || n == -999) {
                break;
            }
            arr[i] = n;
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}