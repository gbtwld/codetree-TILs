import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{1, 0, 0, -1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static int getDir(char a) {
        if (a == 'U') {
            return 2;
        } else if (a == 'D') {
            return 1;
        } else if (a == 'R') {
            return 0;
        } else if (a == 'L') {
            return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        // 결과에 1 더해야함
        int r = sc.nextInt() - 1, c = sc.nextInt() - 1;
        int d = getDir(sc.next().charAt(0));

        for (int i = 1; i <= t; i++) {
            int nx = r + dx[d], ny = c + dy[d];

            if (!inRange(nx, ny)) {
                d -= 3;
            } else {
                r = nx;
                c = ny;
            }
        }

        System.out.printf("%d %d", r + 1, c + 1);
    }
}