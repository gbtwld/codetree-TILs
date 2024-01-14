import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, result = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < 0) {
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] == arr[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            result = Math.max(result, cnt);
        }

        System.out.print(result);
    }
}