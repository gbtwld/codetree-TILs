import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), timeA = 0, timeB = 0, result = 0;
        int[] arrA = new int[1000001], arrB = new int[1000001];

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                for (int j = 1; j <= t; j++) {
                    arrA[timeA + j] = arrA[timeA + j - 1] - 1;
                }
                timeA += t;
            } else {
                for (int j = 1; j <= t; j++) {
                    arrA[timeA + j] = arrA[timeA + j - 1] + 1;
                }
                timeA += t;
            }
        }

        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                for (int j = 1; j <= t; j++) {
                    arrB[timeB + j] = arrB[timeB + j - 1] - 1;
                }
                timeB += t;
            } else {
                for (int j = 1; j <= t; j++) {
                    arrB[timeB + j] = arrB[timeB + j - 1] + 1;
                }
                timeB += t;
            }
        }

        for (int i = 1; i < Math.max(timeA, timeB); i++) {
            if (i > timeA) {
                arrA[i] = arrA[timeA];
            }
            if (i > timeB) {
                arrB[i] = arrB[timeB];
            }
            if (i > 1 && arrA[i - 1] != arrB[i - 1] && arrA[i] == arrB[i]) {
                result++;
            }
        }

        System.out.print(result);
    }
}