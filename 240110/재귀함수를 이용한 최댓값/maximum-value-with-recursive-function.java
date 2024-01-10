import java.util.Scanner;

public class Main {
    public static int max(int[] arr, int n) {
        if (n == 1) {
            return Math.max(arr[1], arr[0]);
        }

        return Math.max(max(arr, n - 1), arr[n]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(max(arr, n - 1));
    }
}