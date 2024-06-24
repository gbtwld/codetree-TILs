import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int min = Math.min(arr[i], arr[j]);
                int max = Math.max(arr[i], arr[j]);

                if (max - min > k) continue;

                int cnt = 2;
                for (int l = 0; l < n; l++) {
                    if (l == i || l == j) continue;
                    
                    if (arr[l] >= min && arr[l] <= max) cnt++;
                }

                result = Math.max(result, cnt);
            }
        }

        sb.append(result);
        System.out.print(sb);
    }
}