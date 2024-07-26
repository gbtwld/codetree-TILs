import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= 100; i++) {
            boolean satisfied = true;
            for (int j = 0; j < n; j++) {
                if (i < arr[j][0] || i > arr[j][1]) {
                    satisfied = false;
                    break;
                }
            }
            if (satisfied) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        return;
    }
}