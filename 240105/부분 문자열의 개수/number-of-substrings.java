import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        int cnt = 0;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == b.charAt(0) && a.charAt(i + 1) == b.charAt(1)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}