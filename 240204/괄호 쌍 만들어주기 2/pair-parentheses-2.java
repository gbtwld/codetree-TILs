import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String input = sc.next();

        for (int i = 0; i < input.length() - 3; i++) {
            for (int j = i + 2; j < input.length() - 1; j++) {
                if (input.charAt(i) == '(' && input.charAt(i + 1) == '(' && input.charAt(j) == ')' && input.charAt(j + 1) == ')') {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}