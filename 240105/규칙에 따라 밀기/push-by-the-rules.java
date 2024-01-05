import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), e = sc.next();

        for (int i = 0; i < e.length(); i++) {
            if (e.charAt(i) == 'L') {
                a = a.substring(1, a.length()) + a.substring(0, 1);
            } else {
                a = a.substring(a.length() - 1, a.length()) + a.substring(0, a.length() - 1);
            }
        }

        System.out.print(a);
    }
}