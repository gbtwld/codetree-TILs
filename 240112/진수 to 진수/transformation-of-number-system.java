import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int get10Jinsu(String n, int a) {
        int num = 0;

        for (int i = 0; i < n.length(); i++) {
            num = num * a + ((int)n.charAt(i) - (int)'0');
        }

        return num;
    }

    public static void getBJinsu(int n, int b) {
        int[] binary = new int[20];
        int cnt = 0;

        while (true) {
            if (n < b) {
                binary[cnt++] = n;
                break;
            }

            binary[cnt++] = n % b;
            n /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String n = sc.next();

        int n10 = get10Jinsu(n, a);

        getBJinsu(n10, b);
    }
}