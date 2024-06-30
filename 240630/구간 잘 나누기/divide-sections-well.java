import java.util.*;
import java.io.*;

public class Main {
    public static int getMaxVal(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || i == arr.length - 1) {
                maxVal = Math.max(maxVal, sum);
                sum = 0;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int minVal = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n + m - 5; i++) {
            for (int j = i + 2; j <= n + m - 3; j++) {
                int[] result = new int[n + (m - 1)];
                for (int k = 0; k < n + m - 1; k++) {
                    if (k < i) {
                        result[k] = arr[k];
                    } else if (k > i && k < j) {
                        result[k] = arr[k - 1];
                    } else if (k > j) {
                        result[k] = arr[k - 2];
                    } else {
                        result[k] = 0;
                    }
                }
                minVal = Math.min(minVal, getMaxVal(result));
            }
        }
        sb.append(minVal);
        System.out.print(sb);
    }
}