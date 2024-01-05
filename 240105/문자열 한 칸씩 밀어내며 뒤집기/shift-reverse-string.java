import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt(), n;

        for (int i = 0; i < q; i++) {
            n = sc.nextInt();
            if (n == 1) {
                str = str.substring(1, str.length()) + str.substring(0, 1);
                System.out.println(str);
            } else if (n == 2) {
                str = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
                System.out.println(str);
            } else if (n == 3) {
                for (int j = 0; j < str.length(); j++) {
                    str = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
                }
                System.out.println(str);
            }
        }
    }
}