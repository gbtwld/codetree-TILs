import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxVal = Integer.MIN_VALUE;
        int[] from = new int[n], to = new int[n];

        for (int i = 0; i < n; i++) {
            from[i] = sc.nextInt();
            to[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int[] time = new int[1000];
            int totalTime = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = from[j]; k < to[j]; k++) {
                    time[k]++;
                }
            }

            for (int j = 0; j < 1000; j++) {
                    if (time[j] > 0) totalTime++;
            }

            maxVal = Math.max(maxVal, totalTime);
        }

        System.out.print(maxVal);
    }
}