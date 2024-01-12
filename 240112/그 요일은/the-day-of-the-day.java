import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int numsOfDate(int m, int d) {
        int[] dates = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;

        for (int i = 1; i < m; i++) {
            result += dates[i];
        }
        result += d;

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt(), diff = 0, result = 0;
        String targetDay = sc.next();
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        diff = numsOfDate(m2, d2) - numsOfDate(m1, d1);

        result = diff / 7;
        int idxOfTarget = Arrays.asList(days).indexOf(targetDay);

        if (idxOfTarget <= diff % 7) {
            result++;
        }

        System.out.print(result);
    }
}