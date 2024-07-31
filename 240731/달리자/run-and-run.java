import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 1; i++) {
            int diff = arrA[i] - arrB[i];
            cnt += diff;
            arrA[i + 1] += diff;
        }

        sb.append(cnt);
        System.out.print(sb);
    }
}