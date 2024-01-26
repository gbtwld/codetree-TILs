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
        char[][] arr = new char[n][m];
        char c = 'A';
        int x = 0, y = 0, dir = 0;

        for (int i = 0; i < n * m; i++) {
            arr[x][y] = c;
            if (c == 'Z') {
                c = 'A';
            } else {
                c++;
            }
            int nx = x + dx[dir], ny = y + dy[dir];
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