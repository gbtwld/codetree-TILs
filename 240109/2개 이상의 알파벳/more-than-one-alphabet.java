import java.util.Scanner;

public class Main {
    public static boolean alpha(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (alpha(a)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}