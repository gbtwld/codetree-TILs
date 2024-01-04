import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, lengthSum = 0;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == c) {
                cnt++;
                lengthSum += arr[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double)lengthSum / cnt);
    }
}