import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int dir = 0;
        int nx = 0, ny = 0;

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'L') {
                dir = (dir + 3) % 4;
            } else {
                nx = nx + dx[dir];
                ny = ny + dy[dir];
            }
        }

        System.out.printf("%d %d", nx, ny);
    }
}