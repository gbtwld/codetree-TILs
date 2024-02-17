import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minVal = Integer.MAX_VALUE;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int maxX = Integer.MIN_VALUE, minX = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE, minY = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                maxX = Math.max(maxX, arr[j][0]);
                minX = Math.min(minX, arr[j][0]);
                maxY = Math.max(maxY, arr[j][1]);
                minY = Math.min(minY, arr[j][1]);
            }

            minVal = Math.min(minVal, (maxX - minX) * (maxY - minY));
        }

        System.out.print(minVal);
    }
}