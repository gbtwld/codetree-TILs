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
        int t = sc.nextInt();
        String inputs = sc.next();
        int[][] arr = new int[n][n];
        int x = n / 2, y = n / 2, dir = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = arr[x][y];

        for (int i = 0; i < t; i++) {
            char command = inputs.charAt(i);
            if (command == 'L') {
                dir = (3 + dir) % 4;
            } else if (command == 'R') {
                dir = (dir + 1) % 4;
            } else {
                int nx = x + dx[dir], ny = y + dy[dir];
                if (inRange(nx, ny)) {
                    x = nx;
                    y = ny;
                    result += arr[nx][ny];
                }
            }
        }

        System.out.print(result);
    }
}