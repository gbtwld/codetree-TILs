import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for (int i = 1; i <= 100; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) cnt++;
            }
            if (cnt >= i) {
                result = i;
            } else {
                break;
            }
        }

        sb.append(result);
        System.out.print(sb);
    }
}