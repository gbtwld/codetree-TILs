import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), r, c;
        int[][] arr = new int[n][n];

        for (int i = 0; i < m; i++) {
            r = sc.nextInt();
            c = sc.nextInt();
            arr[r - 1][c - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}