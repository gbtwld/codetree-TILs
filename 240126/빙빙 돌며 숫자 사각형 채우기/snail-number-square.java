import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        
        int cnt = 1, dir = 0, x = 0, y = 0;
        int[][] answer = new int[n][m];

        for (int i = 0; i < n * m; i++) {
            answer[x][y] = cnt++;
            int nx = x + dx[dir], ny = y + dy[dir];

            if (!inRange(nx, ny) || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}