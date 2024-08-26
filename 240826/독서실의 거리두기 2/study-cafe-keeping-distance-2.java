import java.util.*;
import java.io.*;

public class Main {
    public static int getMinDist(int[] arr) {
        int minDist = Integer.MAX_VALUE;
        
        int dist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dist == 0 && arr[i] == 0) continue;
            if (arr[i] == 1) {
                if (dist == 0) {
                    dist++;
                } else {
                    minDist = Math.min(minDist, dist);
                    dist = 1;
                }
            } else {
                dist++;
            }
        }
        return minDist;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String input = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i] = input.charAt(i) - '0';
        }

        int maxDist = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) continue;

            arr[i] = 1;

            maxDist = Math.max(maxDist, getMinDist(arr));

            arr[i] = 0;
        }

        sb.append(maxDist);

        System.out.println(sb);
    }
}