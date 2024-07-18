import java.util.*;
import java.io.*;

public class Main {
    public static boolean plusCheck(int a, int l, int[] arr) {
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        
        for (int i = newArr.length - 1; i >= 0; i--) {
            if (newArr[i] >= a) continue;
            if (l > 0) {
                newArr[i]++;
                l--;
            }
        }

        if (easyCheck(a, newArr)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean easyCheck(int a, int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a) cnt++;
        }
        if (cnt >= a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxH = 0;
        for (int i = 0; i <= 101; i++) {
            if (easyCheck(i, arr)) {
                maxH = i;
                continue;
            }
            if (l > 0 && plusCheck(i, l, arr)) {
                maxH = i;
            } else {
                break;
            }
        }

        sb.append(maxH);
        System.out.print(sb);
    }
}