import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // length - 1 까지만 확인하면 됨
        String a = sc.next(), b = sc.next();
        int n = 0;

        while (true) {
            if (n == a.length()) {
                System.out.print(-1);
                break;
            }
            n++;
            a = a.substring(a.length() - 1, a.length()) + a.substring(0, a.length() - 1);
            if (a.equals(b)) {
                System.out.print(n);
                break;
            }
        }
    }
}