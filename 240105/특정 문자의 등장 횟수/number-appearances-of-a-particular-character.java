import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e') {
                if (str.charAt(i + 1) == 'e') {
                    cnt1++;
                } else if (str.charAt(i + 1) == 'b') {
                    cnt2++;
                }
            }
        }

        System.out.printf("%d %d", cnt1, cnt2);
    }
}