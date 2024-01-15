import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N명의 개발자
        int K = sc.nextInt(); // K번의 악수 동안만 전염병을 옮기게 되고
        int P = sc.nextInt(); // 처음 전염병에 걸려 있는 개발자의 번호
        int T = sc.nextInt(); // T번에 걸쳐 주어진다

        int timeIdx = 0;

        int[][] infoArr = new int[T][3];
        int[][] timeArr = new int[251][N + 1];
        timeArr[0][P] = 1 + K;

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            
            infoArr[i][0] = t;
            infoArr[i][1] = x;
            infoArr[i][2] = y;
        }

        Arrays.sort(infoArr, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < T; i++) {
            int xVal = timeArr[timeIdx][infoArr[i][1]];
            int yVal = timeArr[timeIdx][infoArr[i][2]];
            for (int j = 1; j <= N; j++) {
                timeArr[infoArr[i][0]][j] = timeArr[timeIdx][j];
            }
            timeIdx = infoArr[i][0];

            if (xVal > 1) {
                timeArr[timeIdx][infoArr[i][1]] = xVal - 1;
                if (yVal == 0) {
                    timeArr[timeIdx][infoArr[i][2]] = K;
                }
            }
            if (yVal > 1) {
                timeArr[timeIdx][infoArr[i][2]] = yVal - 1;
                if (xVal == 0) {
                    timeArr[timeIdx][infoArr[i][1]] = K;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(timeArr[timeIdx][i] == 0 ? 0 : 1);
        }
    }
}