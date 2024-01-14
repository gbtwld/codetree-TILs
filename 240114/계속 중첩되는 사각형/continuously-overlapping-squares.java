import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), offset = 100, result = 0;
        int[][] arr = new int[200][200];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset, y1 = sc.nextInt() + offset, x2 = sc.nextInt() + offset, y2 = sc.nextInt() + offset;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i % 2 == 0) {
                        arr[j][k] = 1;
                    } else {
                        arr[j][k] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 2) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}