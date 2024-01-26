import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int getDir(char d) {
        if (d == 'E') {
            return 0;
        } else if (d == 'S') {
            return 1;
        } else if (d == 'W') {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int curX = 0, curY = 0, time = 0;

        for (int i = 0; i < n; i++) {
            int dir = getDir(sc.next().charAt(0));
            int dis = sc.nextInt();

            for (int j = 0; j < dis; j++) {
                curX = curX + dx[dir];
                curY = curY + dy[dir];

                time++;

                if (curX == 0 && curY == 0) {
                    System.out.print(time);
                    return;
                }
            }
        }

        System.out.print(-1);
    }
}