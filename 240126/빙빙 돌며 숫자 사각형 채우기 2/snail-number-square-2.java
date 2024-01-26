import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 1, dir = 0, x = 0, y = 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < n * m; i++) {
            int nx = x + dx[dir], ny = y + dy[dir];
            arr[x][y] = cnt;
            cnt++;

            if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }

            x += dx[dir];
            y += dy[dir];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}