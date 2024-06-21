import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int maxVal = Integer.MIN_VALUE;

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int curVal = 0;
            int nextIdx = i;
            for (int j = 0; j < m; j++) {
                curVal += arr[nextIdx];
                nextIdx = arr[nextIdx] - 1;
            }
            maxVal = Math.max(maxVal, curVal);
        }

        sb.append(maxVal);

        System.out.print(sb);
    }
}