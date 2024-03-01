import java.util.Scanner;

public class Main {
    public static boolean checkInter(int a) {
        int[] arr = new int[10];
        int n = 0;
        boolean p = false, t = false;

        while (a > 0) {
            arr[a % 10]++;
            a /= 10;
            n++;
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) continue;

            if (arr[i] == 1) {
                if (p) {
                    return false;
                } else {
                    p = true;
                }
            } else if (arr[i] == n - 1) {
                if (t) {
                    return false;
                } else {
                    t = true;
                }
            }
        }

        if (p && t) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), cnt = 0;

        for (int i = x; i <= y; i++) {
            // System.out.printf("%d %b\n", i, checkInter(i));
            if (checkInter(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}