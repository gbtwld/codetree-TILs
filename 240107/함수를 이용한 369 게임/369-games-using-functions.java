import java.util.Scanner;

public class Main {
    public static boolean is369(int n) {
        String str = Integer.toString(n);
        boolean satisfied = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                satisfied = true;
                break;
            }
        }

        return satisfied;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || is369(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}