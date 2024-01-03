import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), idx = n, maxVal = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (idx != 0) {
            maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < idx; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == maxVal) {
                    idx = i;
                    break;
                }
            }
            System.out.print(idx + 1 + " ");
        }
    }
}