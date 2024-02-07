import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), maxValue = Integer.MIN_VALUE;
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            int candy = sc.nextInt(), idx = sc.nextInt();
            arr[idx] += candy;
        }

        for (int i = k; i <= 100 - k; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += arr[j];
            }
            maxValue = Math.max(maxValue, sum);
        }

        System.out.print(maxValue);
    }
}