import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] dx = new int[]{-1, 0, 1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt() - 1, c = sc.nextInt() - 1, cnt = 0;
            arr[r][c] = 1;

            for (int j = 0; j < 4; j++) {
                int nx = r + dx[j], ny = c + dy[j];

                if (inRange(nx, ny) && arr[nx][ny] == 1) {
                    cnt++;
                }
            }

            System.out.println(cnt == 3 ? 1 : 0);
        }
    }
}