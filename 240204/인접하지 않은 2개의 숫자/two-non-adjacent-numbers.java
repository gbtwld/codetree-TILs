import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxSum = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 2; j < arr.length; j++) {
                maxSum = Math.max(maxSum, arr[i] + arr[j]);
            }
        }

        System.out.print(maxSum);
    }
}