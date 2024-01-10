import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), cnt = 0;
        String t = sc.next();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            boolean satisfied = true;
            String str = sc.next();
            if (str.length() < t.length()) {
                continue;
            }
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) != str.charAt(j)) {
                    satisfied = false;
                    break;
                }
            }
            if (satisfied) {
                arr[cnt++] = str;
            }
        }

        Arrays.sort(arr, 0, cnt);

        System.out.print(arr[k - 1]);
    }
}