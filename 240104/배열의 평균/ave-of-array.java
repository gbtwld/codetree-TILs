import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int sum = 0, totalSum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
                totalSum += arr[i][j];
            }
            System.out.printf("%.1f ", (double)sum / 4);
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.printf("%.1f ", (double)(arr[0][i] + arr[1][i]) / 2);
        }
        System.out.println();

        System.out.printf("%.1f", (double)totalSum / 8);
    }
}