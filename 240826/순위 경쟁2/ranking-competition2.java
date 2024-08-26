import java.util.*;
import java.io.*;

public class Main {
    public static int getH(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return 2;
        } else if (a > b) {
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
        (A, B) => A == B 
        (A), (B)
        */

        int cnt = 0;
        int a = 0, b = 0;
        int n = Integer.parseInt(br.readLine());
        int h = getH(a, b);
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int s = Integer.parseInt(st.nextToken());

            if (c == 'A') {
                a += s;
            } else {
                b += s;
            }

            if (h == getH(a, b)) continue;
            
            h = getH(a, b);
            cnt++;
        }

        sb.append(cnt);

        System.out.println(sb);
    }
}