import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), num = 1;
        int[][] arr = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                arr[j][i - j] = num;
                num++;
                if (j == n - 1) {
                    break;
                }
            }
        }
        // (1, 2) (2, 1)
        // (2, 2)
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[j][i + m - j - 1] = num;
                num++;
                if (i + m - j - 1 == 0) {
                break;   
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}