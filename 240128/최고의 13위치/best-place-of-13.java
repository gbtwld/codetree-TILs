import java.util.Scanner;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxVal = Math.max(maxVal, arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
            }
        }

        System.out.print(maxVal);
    }
}