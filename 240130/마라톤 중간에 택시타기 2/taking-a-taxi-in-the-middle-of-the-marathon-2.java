import java.util.Scanner;

public class Main {
    public static int getDist(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minVal = Integer.MAX_VALUE;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 1; i < n - 1; i++) {
            int dist = 0;

            for (int j = 0; j < n - 1; j++) {
                if (j == i) continue;

                if (j + 1 == i) {
                    dist += getDist(arr[j][0], arr[j][1], arr[j + 2][0], arr[j + 2][1]);
                } else {
                    dist += getDist(arr[j][0], arr[j][1], arr[j + 1][0], arr[j + 1][1]);
                }
            }

            if (minVal > dist) minVal = dist;
        }

        System.out.print(minVal);
    }
}