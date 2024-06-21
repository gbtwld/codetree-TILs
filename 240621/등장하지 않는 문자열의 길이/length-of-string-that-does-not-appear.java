import java.util.*;
import java.io.*;

public class Main {
    public static boolean check(char[] arr, int len) {
        for (int i = 0; i <= arr.length - len; i++) {
            for (int j = i + 1; j <= arr.length - len; j++) {
                boolean satisfied = true;
                for (int k = 0; k < len; k++) {
                    if (arr[i + k] != arr[j + k]) {
                        satisfied = false;
                        break;
                    }
                }
                if (satisfied) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int getMinLen(char[] arr) {
        for (int i = 2; i <= arr.length; i++) {
            if (!check(arr, i)) return i;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char arr[] = new char[n];
        String input = br.readLine();

        for (int i = 0; i < n; i++) {
            arr[i] = input.charAt(i);
        }

        sb.append(getMinLen(arr));

        System.out.print(sb);
    }
}