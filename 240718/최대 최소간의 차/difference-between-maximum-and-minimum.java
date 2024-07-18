import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 10000; i++) {
            int curCost = i;
            int[] curArr = arr.clone();
            Arrays.sort(curArr);

            if (curArr[n - 1] - curArr[0] <= k) {
                sb.append(i);
                break;
            }

            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    curArr[0]++;
                } else {
                    curArr[n - 1]--;
                }
                Arrays.sort(curArr);
            }

            if (curArr[n - 1] - curArr[0] <= k) {
                sb.append(i);
                break;
            }
        }
        
        System.out.print(sb);
    }
}