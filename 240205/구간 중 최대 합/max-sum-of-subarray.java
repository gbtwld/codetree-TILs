import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), maxValue = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            maxValue = Math.max(maxValue, sum);
        }

        System.out.print(maxValue);
    }
}