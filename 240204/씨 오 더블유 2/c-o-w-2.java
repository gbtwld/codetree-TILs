import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        String input = sc.next();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (input.charAt(i) == 'C' && input.charAt(j) == 'O' && input.charAt(k) == 'W') {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}