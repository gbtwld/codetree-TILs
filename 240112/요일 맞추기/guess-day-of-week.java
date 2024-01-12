import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int elapsedDay1 = 0, elapsedDay2 = 0, realElapsedDay = 0, resultIdx = 1;
        int[] date = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (int i = 1; i < m1; i++) {
            elapsedDay1 += date[i];
        }
        elapsedDay1 += d1;
        for (int i = 1; i < m2; i++) {
            elapsedDay2 += date[i];
        }
        elapsedDay2 += d2;

        realElapsedDay = elapsedDay1 - elapsedDay2;

        if (realElapsedDay < 0) {
            for (int i = 0; i < Math.abs(realElapsedDay); i++) {
                resultIdx++;
                if (resultIdx > 6) {
                    resultIdx = 0;
                }
            }
        } else {
            for (int i = 0; i < realElapsedDay; i++) {
                resultIdx--;
                if (resultIdx < 0) {
                    resultIdx = 6;
                }
            }
        }

        System.out.print(day[resultIdx]);
    }
}