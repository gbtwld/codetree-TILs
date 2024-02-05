import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), maxValue = Integer.MIN_VALUE;
        char[] arr = new char[10001];

        for (int i = 0; i < n; i++) {
            int idx = sc.nextInt();
            char alpha = sc.next().charAt(0);

            arr[idx] = alpha;
        }

        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                if (arr[i + j] == 'G') {
                    sum += 1;
                } else if (arr[i + j] == 'H') {
                    sum += 2;
                }
            }
            maxValue = Math.max(maxValue, sum);
        }

        System.out.print(maxValue);
    }
}