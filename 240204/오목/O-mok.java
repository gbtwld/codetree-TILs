import java.util.Scanner;

public class Main {
    public static int n = 19;
    public static int[] dx = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = new int[]{1, 1, 0, -1, -1, -1, 0, 1};

    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) continue;

                for (int dir = 0; dir < 8; dir++) {
                    int cnt = 1;
                    int curX = i;
                    int curY = j;

                    while (true) {
                        int nx = curX + dx[dir];
                        int ny = curY + dy[dir];
                        
                        if (!inRange(nx, ny)) {
                            break;
                        }

                        if (arr[curX][curY] != arr[nx][ny]) {
                            break;
                        }

                        cnt++;
                        if (cnt == 5) {
                            System.out.println(arr[curX][curY]);
                            System.out.printf("%d %d", curX - dx[dir] + 1, curY - dy[dir] + 1);
                            return;
                        }
                        curX = nx;
                        curY = ny;
                    }
                }
            }
        }

        System.out.print(0);
    }
}