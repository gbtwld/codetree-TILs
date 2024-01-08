import java.util.Scanner;

public class Main {
    public static boolean isSatisfied(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        if (n >= 100) {
            return false;
        } else if (n >= 10) {
            if ((n / 10 + n % 10) % 2 != 0) {
                return false;
            }
        } else {
            if (n % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isSatisfied(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}