import java.util.Scanner;

public class Main {
    public static boolean isExist(int m, int d) {
        if (m == 2) {
            return d <= 28;
        } else if (m < 8) {
            if (m % 2 == 0) {
                return d <= 30;
            } else {
                return d <= 31;
            }
        } else if (m <= 12) {
            if (m % 2 == 0) {
                return d <= 31;
            } else {
                return d <= 30;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();

        if (isExist(m, d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}