import java.util.Scanner;

public class Main {
    public static int dir = 0;

    public static int[] dx = new int[]{-1, 0, 1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static void changeDir(char d) {
        if (d == 'L') {
            dir = (dir + 3) % 4;
        } else {
            dir = (dir + 1) % 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String commands = sc.next();
        int curX = 0, curY = 0, time = 0;

        for (int i = 0; i < commands.length(); i++) {
            time++;
            if (commands.charAt(i) == 'F') {
                curX = curX + dx[dir];
                curY = curY + dy[dir];
            } else {
                changeDir(commands.charAt(i));
            }

            if (curX == 0 && curY == 0) {
                System.out.print(time);
                return;
            }
        }

        System.out.print(-1);
    }
}