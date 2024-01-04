import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        String ab = a + b, ba = b + a;
        boolean satisfied = true;

        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i) != ba.charAt(i)) {
                satisfied = false;
            }
        }

        System.out.print(satisfied ? true : false);
    }
}