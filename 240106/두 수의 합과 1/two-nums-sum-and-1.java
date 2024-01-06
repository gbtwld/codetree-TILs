import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String result = Integer.toString(a + b);
        int cnt = 0;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1') {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}