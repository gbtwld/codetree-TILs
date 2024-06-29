import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int maxNum = 0;
        int maxVal = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] result = new int[1000001];
        for (int i = 0; i <= 1000000; i++) {
            int curIdx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    if (curIdx != -1 && j - curIdx <= k) {
                        if (result[i] > 0) {
                            result[i]++;
                        } else {
                            result[i] += 2;
                        }
                    }
                    curIdx = j;
                }
            }
        }

        for (int i = 0; i <= 1000000; i++) {
            if (result[i] >= maxVal && result[i] > 0) {
                System.out.println(i + " : " + result[i]);
                maxVal = result[i];
                maxNum = i;
            }
        }

        sb.append(maxNum);
        System.out.print(sb);
    }
}