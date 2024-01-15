import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), curTime = 0, curPosition = 0, curFor = -1, result = 0;
        int[] arrA = new int[1000 * 1000];
        int[] arrB = new int[1000 * 1000];

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt(), t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                curPosition += v;
                arrA[curTime + j] = curPosition;
            }
            curTime += t;
        }

        curTime = 0;
        curPosition = 0;

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt(), t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                curPosition += v;
                arrB[curTime + j] = curPosition;
            }
            curTime += t;
        }

        for (int i = 1; i <= curTime; i++) {
            if (curFor == -1 && arrA[i] == arrB[i]) {
                continue;
            }
            if (arrA[i] > arrB[i] && curFor == 1) {
                curFor = 0;
                result++;
            } else if (arrA[i] < arrB[i] && curFor == 0) {
                curFor = 1;
                result++;
            }
        }

        System.out.print(result);
    }
}