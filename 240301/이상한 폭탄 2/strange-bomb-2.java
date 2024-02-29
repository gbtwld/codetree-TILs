import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), result = -1;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    result = Math.max(result, arr[i]);
                }
            }
            for (int j = i + 1; j <= i + 3; j++) {
                if (j == n) break;
                
                if (arr[j] == arr[i]) {
                    result = Math.max(result, arr[i]);
                }
            }
        }

        System.out.print(result);
    }
}