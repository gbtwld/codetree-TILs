import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), curTime = 0, curPosition = 0, curFor = 0, result = 0;
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
            if (i == 1) {
                if (arrA[i] > arrB[i]) {
                    curFor = 1;
                } else if (arrA[i] < arrB[i]) {
                    curFor = 2;
                } else {
                    curFor = -1;
                }
            }
            if (arrA[i] > arrB[i]) {
                if (curFor == 1) {
                    result++;
                }
                curFor = 0;
            } else if (arrA[i] < arrB[i]) {
                if (curFor == 0) {
                    result++;
                }
                curFor = 1;
            }
        }

        System.out.print(result);
    }
}