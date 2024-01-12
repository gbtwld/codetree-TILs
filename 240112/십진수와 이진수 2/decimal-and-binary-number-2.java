import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int[] digits = new int[20];
        int num = 0, cnt = 0;

        for (int i = 0; i < binary.length(); i++) {
            num = num * 2 + ((int)binary.charAt(i) - (int)'0');
        }

        num *= 17;

        while (true) {
            if (num < 2) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % 2;
            num /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}