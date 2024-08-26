import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        while (true) {
            if (arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
                break;
            }

            if (arr[0] + 1 == arr[1]) {
                arr[0] = arr[1] + 1;
            } else if (arr[1] + 1 == arr[2]) {
                arr[2] = arr[1] - 1;
            } else {
                arr[0] = arr[1] + 1;
            }

            cnt++;
            Arrays.sort(arr);
        }

        sb.append(cnt);
        System.out.println(cnt);
    }
}