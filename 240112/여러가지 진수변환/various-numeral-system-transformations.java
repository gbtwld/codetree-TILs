import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt(), cnt = 0;
        int[] digits = new int[20];

        while (true) {
            if (n < b) {
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % b;
            n /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}