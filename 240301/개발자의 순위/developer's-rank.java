import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt(), cnt = 0;
        int[][] arr = new int[k][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;

                boolean satisfied = true;

                for (int round = 0; round < k; round++) {
                    int[] curGame = arr[round];

                    int aIdx = 0, bIdx = 0;
                    for (int l = 0; l < n; l++) {
                        if (curGame[l] == i) aIdx = l;
                        if (curGame[l] == j) bIdx = l;
                    }

                    if (aIdx > bIdx) {
                        satisfied = false;
                    }
                }

                if (satisfied) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}