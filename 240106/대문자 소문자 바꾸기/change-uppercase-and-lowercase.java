import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char num;

        for (int i = 0; i < str.length(); i++) {
            num = str.charAt(i);
            if (num >= 'A' && num <= 'Z') {
                System.out.print((char)(num - 'A' + 'a'));
            } else if (num >= 'a' && num <= 'z') {
                System.out.print((char)(num - 'a' + 'A'));
            }
        }
    }
}