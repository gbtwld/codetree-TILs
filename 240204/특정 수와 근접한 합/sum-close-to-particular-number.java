import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(), sum = 0, minDiff = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int remain = sum - (arr[i] + arr[j]);
                int diff = Math.abs(remain - s);
                minDiff = Math.min(minDiff, diff);
            }
        }

        System.out.print(minDiff);
    }
}