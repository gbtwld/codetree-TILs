import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < 10000; i++) {
            int val = i;
            boolean satisfied = true;
            for (int j = 0; j < n; j++) {
                val *= 2;
                if (val < a[j] || val > b[j]) {
                    satisfied = false;
                    break;
                }
            }
            if (satisfied) {
                sb.append(i);
                break;
            }
        }

        System.out.print(sb);
    }
}