import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 19;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 대각선 / => i < n - 4 && j > 3
        for (int i = 0; i < n - 4; i++) {
            for (int j = 4; j < n; j++) {
                if (arr[i][j] == 1 && arr[i + 1][j - 1] == 1 && arr[i + 2][j - 2] == 1 && arr[i + 3][j - 3] == 1 && arr[i + 4][j - 4] == 1) {
                    System.out.println(1);
                    System.out.printf("%d %d", i + 2 + 1, j - 2 + 1);
                    return;
                } else if (arr[i][j] == 2 && arr[i + 1][j - 1] == 2 && arr[i + 2][j - 2] == 2 && arr[i + 3][j - 3] == 2 && arr[i + 4][j - 4] == 2) {
                    System.out.println(2);
                    System.out.printf("%d %d", i + 2 + 1, j - 2 + 1);
                    return;
                }
            }
        }
        // 대각선 \ => i < n - 4 && j < n - 4
        for (int i = 0; i < n - 4; i++) {
            for (int j = 0; j < n - 4; j++) {
                if (arr[i][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 2][j + 2] == 1 && arr[i + 3][j + 3] == 1 && arr[i + 4][j + 4] == 1) {
                    System.out.println(1);
                    System.out.printf("%d %d", i + 2 + 1, j + 2 + 1);
                    return;
                } else if (arr[i][j] == 2 && arr[i + 1][j + 1] == 2 && arr[i + 2][j + 2] == 2 && arr[i + 3][j + 3] == 2 && arr[i + 4][j + 4] == 2) {
                    System.out.println(2);
                    System.out.printf("%d %d", i + 2 + 1, j + 2 + 1);
                    return;
                }
            }
        }
        // 가로 => i < n && j < n - 4
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 4; j++) {
                if (arr[i][j] == 1 && arr[i][j + 1] == 1 && arr[i][j + 2] == 1 && arr[i][j + 3] == 1 && arr[i][j + 4] == 1) {
                    System.out.println(1);
                    System.out.printf("%d %d", i + 1, j + 2 + 1);
                    return;
                } else if (arr[i][j] == 2 && arr[i][j + 1] == 2 && arr[i][j + 2] == 2 && arr[i][j + 3] == 2 && arr[i][j + 4] == 2) {
                    System.out.println(2);
                    System.out.printf("%d %d", i + 1, j + 2 + 1);
                    return;
                }
            }
        }
        // 세로 => i < n - 4 && j < n
        for (int i = 0; i < n - 4; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && arr[i + 1][j] == 1 && arr[i + 2][j] == 1 && arr[i + 3][j] == 1 && arr[i + 4][j] == 1) {
                    System.out.println(1);
                    System.out.printf("%d %d", i + 2 + 1, j + 1);
                    return;
                } else if (arr[i][j] == 2 && arr[i + 1][j] == 2 && arr[i + 2][j] == 2 && arr[i + 3][j] == 2 && arr[i + 4][j] == 2) {
                    System.out.println(2);
                    System.out.printf("%d %d", i + 2 + 1, j + 1);
                    return;
                }
            }
        }

        System.out.print(0);
    }
}