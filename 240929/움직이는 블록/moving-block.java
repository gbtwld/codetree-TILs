import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int avg = sum / n;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < avg) {
                result += avg - arr[i];
            }
        }
        sb.append(result);
        
        System.out.println(sb);
    }
}