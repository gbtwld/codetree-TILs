import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt(), min = sc.nextInt(), targetHour = sc.nextInt(), targetMin = sc.nextInt();
        int elapsedTime = 0;

        while (true) {
            if (hour == targetHour && min == targetMin) {
                break;
            }

            min++;
            elapsedTime++;

            if (min == 60) {
                min = 0;
                hour++;
            }
        }

        System.out.print(elapsedTime);
    }
}