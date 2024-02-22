import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = Integer.MIN_VALUE;
        int[] x = new int[n], y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i ==k) continue;
                    
                    if (x[i] == x[j] && y[j] == y[k]) {
                        int space = Math.abs(y[i] - y[j]) * Math.abs(x[j] - x[k]);

                        result = Math.max(result, space);
                    }
                }
            }
        }

        System.out.print(result);
    }
}