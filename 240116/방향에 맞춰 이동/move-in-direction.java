import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nx = 0, ny = 0;

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        for (int i = 1; i <= n; i++) {
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();

            if (dir == 'W') {
                nx = nx + dx[2] * dis;
            } else if (dir == 'S') {
                ny = ny + dy[1] * dis;
            } else if (dir == 'N') {
                ny = ny + dy[3] * dis;
            } else if (dir == 'E') {
                nx = nx + dx[0] * dis;
            }
        }

        System.out.printf("%d %d", nx, ny);
    }
}