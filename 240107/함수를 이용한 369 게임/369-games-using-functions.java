import java.util.Scanner;

public class Main {
    public static boolean is369Num(int n) {
        while (n > 0) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean is369(int n) {
        return (n % 3 == 0 || is369Num(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), cnt = 0;

        for (int i = a; i <= b; i++) {
            if (is369(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}