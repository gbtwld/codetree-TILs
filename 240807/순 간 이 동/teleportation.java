import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int minDist = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // A => B
        minDist = Math.min(minDist, Math.abs(a - b));
        // A => x => y => B
        minDist = Math.min(minDist, Math.abs(a - x) + Math.abs(y - b));
        // A => y => x => B
        minDist = Math.min(minDist, Math.abs(a - y) + Math.abs(x - b));

        sb.append(minDist);
        System.out.println(sb);
    }
}