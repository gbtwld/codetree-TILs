import java.util.Scanner;

public class Main {
    public static String reverse(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(str.length() - 1 - i);
        }

        return result;
    }

    public static boolean isPalindrome(String str) {
        String reverseStr = reverse(str);
        
        return str.equals(reverseStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (isPalindrome(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}