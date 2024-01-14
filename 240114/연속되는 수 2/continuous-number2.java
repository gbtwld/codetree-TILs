import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 1, maxCnt = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // i = 0 , i = n - 1
            if (i == 0 || arr[i] != arr[i - 1]) {
                if (maxCnt < cnt) {
                    maxCnt = cnt;
                }
            } else {
                if (i == n - 1) {
                    cnt++;
                    if (maxCnt < cnt) {
                        maxCnt = cnt;
                    }
                } else {
                    cnt++;
                }
            }
        }

        System.out.print(maxCnt);
    }
}