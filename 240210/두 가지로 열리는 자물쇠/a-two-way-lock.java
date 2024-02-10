import java.util.Scanner;

public class Main {
    public static int n;

    public static boolean isIn2(int a, int b) {
        int[] possible = new int[5];
        
        for (int i = 0; i < 5; i++) {
            if (i < 2 && b - 2 + i <= 0) {
                possible[i] = n + (b - 2 + i);
            } else if (i > 2 && b - 2 + i > n) {
                possible[i] = (b - 2 + i) % n;
            } else {
                possible[i] = b - 2 + i;
            }
        }

        // for (int i = 0; i < 5; i++) {
        //     System.out.print(possible[i] + " ");
        // }
        // System.out.println();

        for (int i = 0; i < 5; i++) {
            if (possible[i] == a) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOpen(int[] arr, int a, int b, int c) {
        if (isIn2(a, arr[0]) && isIn2(b, arr[1]) && isIn2(c, arr[2])) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int cnt = 0;
        int[] arr1 = new int[3], arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (isOpen(arr1, i, j, k) || isOpen(arr2, i, j, k)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}