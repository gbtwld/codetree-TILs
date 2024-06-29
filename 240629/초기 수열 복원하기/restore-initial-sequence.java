import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n];
        for (int i = 1; i <= arr[0] - 1; i++) {
            result[0] = i;
            boolean satisfied = true;
            for (int j = 1; j < n; j++) {
                int curVal = arr[j - 1] - result[j - 1];
                if (curVal == result[j - 1]) {
                    satisfied = false;
                    break;
                }
                result[j] = curVal;
            }
            if (satisfied) {
                for (int k = 0; k < n; k++) {
                    sb.append(result[k] + " ");
                }
                break;
            }
        }

        System.out.print(sb);
    }
}