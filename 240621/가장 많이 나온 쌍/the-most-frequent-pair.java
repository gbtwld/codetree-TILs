import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int maxVal = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][2];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    if (arr[k][0] == i && arr[k][1] == j || arr[k][0] == j && arr[k][1] == i) {
                        cnt++;
                    }
                }
                maxVal = Math.max(maxVal, cnt);
            }
        }
        sb.append(maxVal);

        System.out.print(sb);
    }
}