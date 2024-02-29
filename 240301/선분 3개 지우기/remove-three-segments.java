import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        int[] a = new int[n], b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int[] arr = new int[101];

                    for (int l = 0; l < n; l++) {
                        if (l == i || l == j || l == k) continue;

                        for (int r = a[l]; r <= b[l]; r++) {
                            arr[r]++;
                        }
                    }

                    boolean satisfied = true;
                    for (int l = 0; l <= 100; l++) {
                        if (arr[l] > 1) {
                            satisfied = false;
                            break;
                        }
                    }

                    if (satisfied) {
                        ans++;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}