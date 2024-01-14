import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 1, result = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] > arr[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            result = Math.max(result, cnt);
        }

        System.out.print(result);
    }
}