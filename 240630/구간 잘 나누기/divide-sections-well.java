import java.util.*;
import java.io.*;

public class Main {
    public static boolean isSatisfied(int[] arr, int max, int m) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m == 1 && sum + arr[i] > max) return false;

            if (sum + arr[i] > max) {
                sum = arr[i];
                m -= 1;
            } else {
                sum += arr[i];
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            maxVal = Math.max(maxVal, arr[i]);
        }

        for (int i = maxVal; i < 10000; i++) {
            if (isSatisfied(arr, i, m)) {
                sb.append(i);
                break;
            }
        }
        System.out.print(sb);
    }
}