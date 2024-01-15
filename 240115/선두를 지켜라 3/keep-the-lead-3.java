import java.util.Scanner;

public class Main {
    public static int MAX_TIME = 1000 * 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), timeA = 0, timeB = 0, leader = -1, result = 0;
        int[] arrA = new int[MAX_TIME + 1], arrB = new int[MAX_TIME + 1];

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt(), t = sc.nextInt();

            for (int j = 1; j <= t; j++) {
                timeA++;
                arrA[timeA] = arrA[timeA - 1] + v;
            }
        }

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt(), t = sc.nextInt();

            for (int j = 1; j <= t; j++) {
                timeB++;
                arrB[timeB] = arrB[timeB - 1] + v;
            }
        }

        for (int i = 1; i <= timeA; i++) {
            if (arrA[i] > arrB[i]) {
                if (leader != 1) {
                    leader = 1;
                    result++;
                }
            } else if (arrA[i] < arrB[i]) {
                if (leader != 2) {
                    leader = 2;
                    result++;
                }
            } else if (arrA[i] == arrB[i]) {
                if (leader != 0) {
                    leader = 0;
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}