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
                    if (curArr[0] > curArr[1]) {
                        int tmp = curArr[0];
                        curArr[0] = curArr[1];
                        curArr[1] = tmp;
                    }
                } else {
                    curArr[n - 1]--;
                    if (curArr[n - 1] < curArr[n - 2]) {
                        int tmp = curArr[n - 1];
                        curArr[n - 1] = curArr[n - 2];
                        curArr[n - 2] = tmp;
                    }
                }
            }

            if (curArr[n - 1] - curArr[0] <= k) {
                sb.append(i);
                break;
            }
        }
        
        System.out.print(sb);
    }
}