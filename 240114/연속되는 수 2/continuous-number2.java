import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, maxCnt = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1] || i == n - 1) {
                if (i == 0) {
                    cnt = 1;
                }
                if (cnt > maxCnt) {
                    if (i == n - 1) {
                        cnt++;
                    }
                    maxCnt = cnt;
                }
                cnt = 1;
            } else {
                cnt++;
            }
        }

        System.out.print(maxCnt);
    }
}