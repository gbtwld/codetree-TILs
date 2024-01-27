import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int dist = Math.abs(i - j);
                sum += dist * arr[j];
            }
            if (sum < result) {
                result = sum;
            }
        }

        System.out.print(result);
    }
}