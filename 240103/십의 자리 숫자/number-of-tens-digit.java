import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int num;

        for (int i = 0; i < 100; i++) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[num / 10]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d - %d\n", i, arr[i]);
        }
    }
}