import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            if (arr[2] - arr[1] == 1 && arr[1] - arr[0] == 1) {
                break;
            }

            if (arr[1] - arr[0] == 2) {
                arr[2] = arr[1] - 1;
            } else if (arr[2] - arr[1] == 2) {
                arr[0] = arr[1] + 1;
            } else {
                if (arr[1] - arr[0] == 1) {
                    arr[0] = arr[1] + (arr[2] - arr[1]) / 2;
                } else {
                    arr[2] = arr[0] + (arr[1] - arr[0]) / 2;
                }
            }

            Arrays.sort(arr);
            cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}