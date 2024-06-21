import java.util.*;
import java.io.*;

public class Main {
    public static int getDist(int[] arr) {
        int minDist = Integer.MAX_VALUE;
        int curDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (curDist == 0 && arr[i] == 1 || curDist > 0 && arr[i] == 0) {
                curDist++;
            } else if (curDist > 0 && arr[i] == 1) {
                minDist = Math.min(minDist, curDist);
                curDist = 1;
            }
        }
        return minDist;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int maxVal = Integer.MIN_VALUE;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String input = br.readLine();
        for (int i = 0; i < n; i++) {
            arr[i] = Character.getNumericValue(input.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) continue;
            arr[i] = 1;
            maxVal = Math.max(maxVal, getDist(arr));
            arr[i] = 0;
        }

        sb.append(maxVal);

        System.out.print(sb);
    }
}