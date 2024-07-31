import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int maxL = Integer.MIN_VALUE;
            int minR = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                maxL = Math.max(maxL, x1[j]);
                minR = Math.min(minR, x2[j]);
            }

            if (maxL <= minR) {
                sb.append("Yes");
                System.out.print(sb);
                return;
            }
        }

        sb.append("No");
        System.out.print(sb);
    }
}