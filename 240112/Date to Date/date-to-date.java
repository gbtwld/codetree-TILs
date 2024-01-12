import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int[] date = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int elapsedDay = 1;

        while (true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }

            d1++;
            elapsedDay++;

            if (d1 > date[m1]) {
                d1 = 1;
                m1++;
            }
        }

        System.out.print(elapsedDay);
    }
}