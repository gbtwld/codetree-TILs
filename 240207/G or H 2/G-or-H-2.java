import java.util.Scanner;

public class Main {
    public static boolean isSatisfied(int a, int b, char[] arr) {
        int g = 0, h = 0;
        for (int i = a; i <= b; i++) {
            if (arr[i] == 'G') g++;
            if (arr[i] == 'H') h++;
        }

        if (g > 0 || h > 0) {
            if (g == 0 || h == 0 || g == h) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0;
        char[] arr = new char[101];

        for (int i = 0; i < n; i++) {
            int idx = sc.nextInt();
            char c = sc.next().charAt(0);

            arr[idx] = c;
        }

        for (int i = 0; i < 100; i++) {
            for (int j = i + 1; j <= 100; j++) {
                if (arr[i] != '\u0000' && arr[j] != '\u0000' && isSatisfied(i, j, arr)) {
                    result = Math.max(result, j - i);
                }
            }
        }

        System.out.print(result);
    }
}