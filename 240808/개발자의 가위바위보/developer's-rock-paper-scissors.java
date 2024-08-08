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

        int maxWin = Integer.MIN_VALUE;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) continue;

                for (int k = 1; k <= 3; k++) {
                    if (i == k || j == k) continue;
                    
                    int win = 0;
                    for (int l = 0; l < n; l++) {
                        if ((arr[l][0] == i && arr[l][1] == j) || (arr[l][0] == j && arr[l][1] == k) || (arr[l][0] == k && arr[l][1] == i)) {
                            win++;
                        }
                    }
                    maxWin = Math.max(maxWin, win);
                }
            }
        }

        sb.append(maxWin);
        System.out.println(sb);
    }
}