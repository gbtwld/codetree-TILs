import java.util.Scanner;

public class Main {
    public static int n;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;

                for (int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = i + dx[dirNum], ny = j + dy[dirNum];

                    if (inRange(nx, ny) && arr[nx][ny] == 1) {
                        cnt++;
                    }
                }

                if (cnt >= 3) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}