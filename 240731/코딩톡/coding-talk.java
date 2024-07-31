import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        char[] writer = new char[m];
        int[] unreadCnt = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            writer[i] = st.nextToken().charAt(0);
            unreadCnt[i] = Integer.parseInt(st.nextToken());
        }

        if (unreadCnt[p - 1] == 0) {
            return;
        }

        boolean[] reader = new boolean[n];
        for (int i = p - 1; i < m; i++) {
            reader[writer[i] - 'A'] = true;
        }
        for (int i = 0; i < m; i++) {
            if (!reader[i]) {
                sb.append((char)('A' + i) + " ");
            }
        }

        System.out.println(sb);
    }
}