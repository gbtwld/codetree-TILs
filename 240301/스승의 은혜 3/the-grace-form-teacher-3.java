import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt(), ans = Integer.MIN_VALUE;
        int[] p = new int[n], s = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int[] totalCost = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    totalCost[j] = p[j] / 2 + s[j];
                } else {
                    totalCost[j] = p[j] + s[j];
                }
            }

            Arrays.sort(totalCost);
            int curCost = 0;
            int cnt = 0;
            
            for (int j = 0; j < n; j++) {
                if (curCost + totalCost[j] > b) break;

                curCost += totalCost[j];
                cnt++;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}