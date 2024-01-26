import java.util.Scanner;

public class Main {
    public static int n;
    public static int dir;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static void changeDir(int prevDir, char mirror) {
        // S = 0, W = 1, N = 2, E = 3
        // "/"의 경우 : S => W, W => S, E => N, N => E
        // "\"의 경우 : S => E, E => S, W => N, N => W
        if (mirror == '/') {
            switch (prevDir) {
                case 0:
                    dir = 1;
                    break;
                case 1:
                    dir = 0;
                    break;
                case 2:
                    dir = 3;
                    break;
                case 3:
                    dir = 2;
                    break;
            }
        } else {
            switch (prevDir) {
                case 0:
                    dir = 3;
                    break;
                case 1:
                    dir = 2;
                    break;
                case 2:
                    dir = 1;
                    break;
                case 3:
                    dir = 0;
                    break;
            }
        }
    }

    public static int getStartDir(int a) {
        if (a % n == 0) {
            return (a / n) - 1;
        } else {
            return a / n;
        }
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char[][] arr = new char[n][n];
        int x, y, cnt = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int start = sc.nextInt();
        dir = getStartDir(start);

        if (start <= n) {
            x = 0;
            y = (start - 1) % n;
        } else if (start <= 4 * n / 2) {
            y = n - 1;
            x = (start - 1) % n;
        } else if (start <= 4 * n - n) {
            x = n - 1;
            y = (4 * n - start) % n;
        } else {
            y = 0;
            x = (4 * n - start) % n;
        }

        while (true) {
            cnt++;
            changeDir(dir, arr[x][y]);

            int nx = x + dx[dir], ny = y + dy[dir];

            if (inRange(nx, ny)) {
                x = nx;
                y = ny;
            } else {
                break;
            }
        }

        System.out.print(cnt);
    }
}