import java.util.Scanner;

public class Main {
    public static int getNum(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        return getNum(n / 3) + getNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(getNum(n));
    }
}