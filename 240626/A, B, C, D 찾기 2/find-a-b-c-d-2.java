import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                for (int c = 1; c <= 10; c++) {
                    for (int d = 1; d <= 10; d++) {
                        int[] arr2 = new int[]{a, b, c, d, a + b, b + c, c + d, d + a, a + c, b + d, a + b + c, a + b + d, a + c + d, b + c + d, a + b + c + d};
                        Arrays.sort(arr2);
                        boolean satisfied = true;
                        for (int i = 0; i < 15; i++) {
                            if (!(arr[i] == arr2[i])) {
                                satisfied = false;
                                break;
                            }
                        }
                        if (satisfied) {
                            sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ");
                            System.out.print(sb);
                            return;
                        }
                    }
                }
            }
        }
    }
}