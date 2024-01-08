import java.util.Scanner;

public class Main {
    public static boolean isOnjunsu(int i) {
        if (i % 2 != 0 && i % 10 != 5 && !(i % 3 == 0 && i % 9 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isOnjunsu(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}