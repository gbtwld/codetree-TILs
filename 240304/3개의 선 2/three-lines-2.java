import java.util.Scanner;

public class Main {
    public static boolean check(int a, int b, int c, int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    boolean satisfied = true;
                    
                    for (int l = 0; l < n; l++) {

                        if (!(a == arr[l][i] || b == arr[l][j] || c == arr[l][k])) {
                            satisfied = false;
                            break;
                        }
                    }

                    if (satisfied) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 10; k++) {
                    if (check(i, j, k, arr)) {
                        System.out.print(1);
                        return;
                    }
                }
            }
        }

        System.out.print(0);
    }
}