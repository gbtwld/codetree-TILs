import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 11, hour = 11, min = 11;
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int elapsedMin = 0;

        if (a < 11 || a <= 11 && b < 11 || a <= 11 && b <= 11 && c < 11) {
            System.out.print(-1);
        } else {
            while (true) {
                if (day == a && hour == b && min == c) {
                    break;
                }

                min++;
                elapsedMin++;

                if (min == 60) {
                    min = 0;
                    hour++;
                }
                if (hour == 24) {
                    hour = 0;
                    day++;
                }
            }

            System.out.print(elapsedMin);
        }
    }
}