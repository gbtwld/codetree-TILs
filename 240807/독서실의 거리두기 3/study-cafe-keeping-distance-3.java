import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.charAt(i) - '0';
        }

        int maxDist = Integer.MIN_VALUE;
        int maxDistIdx = -1;
        int dist = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1) {
                dist++;
                if (dist > maxDist) {
                    maxDist = dist;
                    maxDistIdx = i;
                }
                dist = 0;
            } else {
                dist++;
            }
        }

        arr[maxDistIdx - (maxDist / 2)] = 1;
        int minDist = Integer.MAX_VALUE;
        dist = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1) {
                dist++;
                minDist = Math.min(minDist, dist);
                dist = 0;
            } else {
                dist++;
            }
        }

        sb.append(minDist);
        System.out.println(sb);
    }
}