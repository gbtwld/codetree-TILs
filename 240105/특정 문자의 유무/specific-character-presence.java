import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean exist1 = false, exist2 = false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                exist1 = true;
            }
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                exist2 = true;
            }
        }

        System.out.print(exist1 ? "Yes " : "No ");
        System.out.print(exist2 ? "Yes" : "No");
    }
}