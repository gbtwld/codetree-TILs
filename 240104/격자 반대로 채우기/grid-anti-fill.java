import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num = 1;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) { // 열
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) { //행
                        arr[n - j - 1][n - 1 - i] = num;
                        num++;
                    }
                } else {
                    for (int j = 0; j < n; j++) { //행
                        arr[j][n - 1 - i] = num;
                        num++;
                    }
                }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}