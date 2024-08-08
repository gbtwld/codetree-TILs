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
        // 1 => 2 => 3 => 1
        int win = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 1 && arr[i][1] == 2) {
                win++;
            } else if (arr[i][0] == 2 && arr[i][1] == 3) {
                win++;
            } else if (arr[i][0] == 3 && arr[i][1] == 1) {
                win++;
            }
        }
        maxWin = Math.max(maxWin, win);
        // 1 => 3 => 2 => 1
        win = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 1 && arr[i][1] == 3) {
                win++;
            } else if (arr[i][0] == 3 && arr[i][1] == 2) {
                win++;
            } else if (arr[i][0] == 2 && arr[i][1] == 1) {
                win++;
            }
        }
        maxWin = Math.max(maxWin, win);

        sb.append(maxWin);
        System.out.println(sb);
    }
}