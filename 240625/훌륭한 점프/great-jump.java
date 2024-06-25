import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPossible(int a, int[] arr, int k) {
        int dist = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= a) {
                if (dist >= k) {
                    return false;
                }
                dist = 0;
            } else {
                dist++;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = Math.max(arr[0], arr[n - 1]); i <= n; i++) {
            if (isPossible(i, arr, k)) {
                sb.append(i);
                break;
            }
        }

        System.out.print(sb);
    }
}