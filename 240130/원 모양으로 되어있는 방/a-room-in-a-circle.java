import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minDist = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int dist = 0;

            for (int j = 0; j < n; j++) {
                int curRoom = (i + j) % n;
                int curDist = j;
                dist += arr[curRoom] * curDist;
            }

            minDist = Math.min(minDist, dist);
        }

        System.out.print(minDist);
    }
}