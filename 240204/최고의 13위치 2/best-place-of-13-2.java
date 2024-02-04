import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxVal = Integer.MIN_VALUE;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {
                        if (n < 6 && i == k) break;
                        if (i == k && j - l < 3) continue;

                        maxVal = Math.max(maxVal, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[k][l] + arr[k][l + 1] + arr[k][l + 2]);
                    }
                }
            }
        }

        System.out.print(maxVal);
    }
}