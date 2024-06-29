import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i <= 83; i++) {
            int cost = 0;
            int minHeight = i;
            int maxHeight = i + 17;

            for (int j = 0; j < n; j++) {
                if (arr[j] < minHeight) {
                    cost += (minHeight - arr[j]) * (minHeight - arr[j]);
                } else if (arr[j] > maxHeight) {
                    cost += (arr[j] - maxHeight) * (arr[j] - maxHeight);
                }
            }

            minCost = Math.min(minCost, cost);
        }

        sb.append(minCost);
        System.out.print(sb);
    }
}