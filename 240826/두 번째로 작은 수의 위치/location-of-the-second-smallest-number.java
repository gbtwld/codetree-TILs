import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            minVal = Math.min(minVal, arr[i]);
        }

        int minDiff = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == minVal) continue;

            if (arr[i] - minVal < minDiff) {
                minDiff = arr[i] - minVal;
                idx = i;
            } else {
                System.out.println(-1);
                return;
            }
        }

        sb.append(idx + 1);
        System.out.println(sb);
    }
}