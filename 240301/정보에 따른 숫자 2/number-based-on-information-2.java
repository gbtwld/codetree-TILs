import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), cnt = 0;
        int[][] arr = new int[t][2];

        for (int i = 0; i < t; i++) {
            if (sc.next().charAt(0) == 'S') {
                arr[i][0] = 0;
                arr[i][1] = sc.nextInt();
            } else {
                arr[i][0] = 1;
                arr[i][1] = sc.nextInt();
            }
        }

        for (int k = a; k <= b; k++) {
            int d1 = Integer.MAX_VALUE, d2 = Integer.MAX_VALUE;

            for (int j = 0; j < t; j++) {
                if (arr[j][0] == 0) {
                    d1 = Math.min(d1, Math.abs(arr[j][1] - k));
                } else {
                    d2 = Math.min(d2, Math.abs(arr[j][1] - k));
                }
            }

            if (d1 <= d2) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}