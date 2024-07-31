import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        Arrays.fill(arr, -1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int position = Integer.parseInt(st.nextToken());
            if (arr[number] != -1 && arr[number] != position) {
                cnt++;
            }
            arr[number] = position;
        }

        sb.append(cnt);
        System.out.print(sb);
    }
}