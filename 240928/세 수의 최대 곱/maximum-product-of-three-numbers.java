import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int case1 = arr[0] * arr[1] * arr[n - 1];
        int case2 = arr[n - 1] * arr[n - 2] * arr[n - 3];

        // 음수 2개 양수 1개, 양수 3개

        sb.append(Math.max(case1, case2));

        System.out.println(sb);
    }
}