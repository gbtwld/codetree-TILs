import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), budget = sc.nextInt(), maxVal = Integer.MIN_VALUE;
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        for (int i = 0; i < n; i++) {
            int totalCost = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    totalCost += p[j] / 2;
                    cnt++;
                } else {
                    totalCost += p[j];
                    cnt++;
                }

                if (totalCost > budget) {
                    cnt--;
                    break;
                }
            }

            maxVal = Math.max(maxVal, cnt);
        }

        System.out.print(maxVal);
    }
}