import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        System.out.println(str);
        for (int i = 0; i < n; i++) {
            str = str.substring(n - 1, n) + str.substring(0, n - 1);
            System.out.println(str);
        }
    }
}