import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    System.out.print((char)(str.charAt(i) - 'a' + 'A'));
                } else {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}