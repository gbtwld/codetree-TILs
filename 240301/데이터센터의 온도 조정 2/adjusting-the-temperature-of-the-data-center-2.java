import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt(), g = sc.nextInt(), h = sc.nextInt();
        int[] ta = new int[n], tb = new int[n];
        int minTa = Integer.MAX_VALUE, maxTb = Integer.MIN_VALUE;

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();

            minTa = Math.min(minTa, ta[i]);
            maxTb = Math.max(maxTb, tb[i]);
        }

        for (int i = minTa; i <= maxTb; i++) {
            int totalVal = 0;

            for (int j = 0; j < n; j++) {
                if (i < ta[j]) {
                    totalVal += c;
                } else if (i >= ta[j] && i <= tb[j]) {
                    totalVal += g;
                } else if (i > tb[j]) {
                    totalVal += h;
                }
            }

            result = Math.max(result, totalVal);
        }

        System.out.print(result);
    }
}