import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        int result = -1;

        for (int i = 0; i < str1.length(); i++) {
            if (i > str1.length() - str2.length() || result != -1) {
                break;
            }
            if (str1.charAt(i) == str2.charAt(0)) {
                result = i;
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        result = -1;
                        break;
                    }
                }
            }
        }

        System.out.print(result);
    }
}