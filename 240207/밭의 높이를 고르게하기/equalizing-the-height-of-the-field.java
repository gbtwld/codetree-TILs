import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt(), t = sc.nextInt(), result = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - t + 1; i++) {
            int cost = 0;
            for (int j = 0; j < t; j++) {
                cost += Math.abs(arr[i + j] - h);
            }
            result = Math.min(result, cost);
        }

        System.out.print(result);
    }
}