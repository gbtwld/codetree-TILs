import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        String a = sc.next(), b;

        for (int i = 0; i < n; i++) {
            b = sc.next();
            if (b.equals(a)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}