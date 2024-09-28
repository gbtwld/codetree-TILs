import java.util.*;
import java.io.*;

public class Main {
    public static void updateRank(int[] rank, int[] point) {
        int curMax = Math.max(point[0], Math.max(point[1], point[2]));
        for (int i = 0; i < 3; i++) {
            if (point[i] == curMax) {
                rank[i] = 1;
            } else {
                rank[i] = 0;
            }
        }
    }

    public static boolean isEqual(int[] rank, int[] point) {
        int curMax = Math.max(point[0], Math.max(point[1], point[2]));
        for (int i = 0; i < 3; i++) {
            if (rank[i] == 1) {
                if (point[i] == curMax) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (point[i] == curMax) {
                    return false;
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] cArr = new char[n];
        int[] sArr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cArr[i] = st.nextToken().charAt(0);
            sArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] point = new int[3];
        int[] rank = new int[]{1, 1, 1};
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cArr[i] == 'A') {
                point[0] += sArr[i];
            } else if (cArr[i] == 'B') {
                point[1] += sArr[i];
            } else if (cArr[i] == 'C') {
                point[2] += sArr[i];
            }

            if (isEqual(rank, point)) {
                continue;
            } else {
                updateRank(rank, point);
                cnt++;
            }
        }

        sb.append(cnt);

        System.out.println(sb);
    }
}