import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int elapsedDay = 0, resultIdx = 1;
        int[] date = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        while (true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }

            elapsedDay++;
            d1--;

            if (d1 == 0) {
                m1--;
                d1 = date[m1];
            }
        }
        
        for (int i = 0; i < elapsedDay; i++) {
            resultIdx--;
            if (resultIdx < 0) {
                resultIdx = 6;
            }
        }

        System.out.print(day[resultIdx]);
    }
}