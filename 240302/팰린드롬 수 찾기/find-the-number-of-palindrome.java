import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int i) {
        String num = "";

        while(i > 0) {
            num = num + i % 10;
            i /= 10;
        }

        int n = num.length();
        
        for (int j = 0; j < n / 2; j++) {
            if (num.charAt(j) != num.charAt(n - 1 - j)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), cnt = 0;
        
        for (int i = x; i <= y; i++) {
            if (isPalindrome(i)) cnt++;
        }

        System.out.print(cnt);
    }
}