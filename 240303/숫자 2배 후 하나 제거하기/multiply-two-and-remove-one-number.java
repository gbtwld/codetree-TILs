import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr[i] *= 2;

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                int[] remainArr = new int[n - 1];
                int idx = 0;

                for (int k = 0; k < n; k++) {
                    if (k == j) continue;

                    remainArr[idx++] = arr[k];
                }

                int sum = 0;

                for (int k = 0; k < n - 2; k++) {
                    sum += Math.abs(remainArr[k] - remainArr[k + 1]);
                }

                ans = Math.min(sum, ans);
            }

            arr[i] /= 2;
        }

        System.out.print(ans);
    }
}