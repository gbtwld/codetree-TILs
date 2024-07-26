import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int minR = Integer.MAX_VALUE;
        int maxL = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            minR = Math.min(minR, arr[i][1]);
            maxL = Math.max(maxL, arr[i][0]);
        }

        if (minR < maxL) {
            sb.append("No");
        } else {
            sb.append("Yes");
        }

        System.out.print(sb);
    }
}