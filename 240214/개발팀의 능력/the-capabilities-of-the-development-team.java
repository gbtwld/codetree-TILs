import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPossible = false;
        int sum = 0, result = Integer.MAX_VALUE;
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = k + 1; k < 5; k++) {
                        if (k == i || k == j || l == i || l == j) continue;

                        int a = arr[i] + arr[j];
                        int b = arr[k] + arr[l];
                        int c = sum - (a + b);

                        if (a == b || b == c || a == c) continue;
                        isPossible = true;


                        int maxValue = Math.max(a, Math.max(b, c));
                        int minValue = Math.min(a, Math.min(b, c));
                        int diff = maxValue - minValue;

                        result = Math.min(result, diff);
                    }
                }
            }
        }

        if (!isPossible) {
            System.out.print(-1);
        } else {
            System.out.print(result);
        }
    }
}