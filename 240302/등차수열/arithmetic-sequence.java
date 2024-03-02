import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE, ans = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }

        for (int k = minVal; k <= maxVal; k++) {
            int cnt = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (Math.abs(arr[i] - k) == Math.abs(arr[j] - k)) cnt++;
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}