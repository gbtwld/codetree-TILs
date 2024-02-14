import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0, result = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        if (k == i || k == j || l == i || l == j) continue;
                        int a = arr[i] + arr[j];
                        int b = arr[k] + arr[l];
                        int c = sum - (a + b);

                        int maxVal = Math.max(a, Math.max(b, c));
                        int minVal = Math.min(a, Math.min(b, c));
                        int diff = maxVal - minVal;

                        result = Math.min(result, diff);
                    }
                }
            }
        }

        System.out.print(result);
    }
}