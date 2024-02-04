import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
    public static int[] dy = new int[]{1, 1, 0, -1, -1, -1, 0, 1};

    public static int n, m, result = 0;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
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

                            if (arr[nx][ny] == 'E') {
                                curX = nx;
                                curY = ny;
                                cnt++;
                            } else {
                                break;
                            }

                            if (cnt == 3) {
                                result++;
                                break;
                            }
                        }
                    }
                }
            }
        }

        System.out.print(result);
    }
}