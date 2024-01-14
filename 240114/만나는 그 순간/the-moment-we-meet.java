import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), curTime = 0, curPosition = 0, result = -1, aLast = 0, bLast = 0;
        int[] a = new int[1000], b = new int[1000];

        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int num = sc.nextInt();

            if (dir == 'L') {
                for (int j = 1; j <= num; j++) {
                    curTime++;
                    curPosition--;
                    a[curTime] = curPosition;
                }
            } else {
                for (int j = 1; j <= num; j++) {
                    curTime++;
                    curPosition++;
                    a[curTime] = curPosition;
                }
            }
        }
        aLast = curTime;
        curTime = 0;
        curPosition = 0;
        for (int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0);
            int num = sc.nextInt();

            if (dir == 'L') {
                for (int j = 1; j <= num; j++) {
                    curTime++;
                    curPosition--;
                    b[curTime] = curPosition;
                }
            } else {
                for (int j = 1; j <= num; j++) {
                    curTime++;
                    curPosition++;
                    b[curTime] = curPosition;
                }
            }
        }
        bLast = curTime;

        for (int i = 1; i < Math.min(aLast, bLast); i++) {
            if (a[i] == b[i]) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}