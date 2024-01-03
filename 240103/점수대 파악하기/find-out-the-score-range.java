import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int point;

        for (int i = 0; i < 100; i++) {
            point = sc.nextInt();
            if (point == 0) {
                break;
            }
            arr[point / 10]++;
        }

        for (int i = 10; i > 0; i--) {
            System.out.printf("%d - %d\n", i * 10, arr[i]);
        }
    }
}