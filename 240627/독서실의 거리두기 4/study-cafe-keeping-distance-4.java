import java.util.*;
import java.io.*;

public class Main {
    public static int getMinDist(int a, int b, int[] arr) {
        arr[a] = 1;
        arr[b] = 1;

        int minDist = Integer.MAX_VALUE;
        int curDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (curDist == 0 && arr[i] == 1) {
                curDist++;
            } else if (curDist > 0 && arr[i] == 1) {
                minDist = Math.min(minDist, curDist);
                curDist = 1;
            } else if (curDist > 0 && arr[i] == 0) {
                curDist++;
            }
        }

        return minDist;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int result = Integer.MIN_VALUE;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String input = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == 1 || arr[j] == 1) continue;

                int maxDist = getMinDist(i, j, arr.clone());
                result = Math.max(result, maxDist);
            }
        }

        sb.append(result);
        System.out.print(sb);
    }
}