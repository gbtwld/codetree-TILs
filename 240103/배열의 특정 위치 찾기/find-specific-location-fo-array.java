import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int aSum = 0, bSum = 0, bCnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 == 0) {
                aSum += arr[i];
            }
            if ((i + 1) % 2 == 0) {
                bSum += arr[i];
                bCnt++;
            }
        }

        System.out.printf("%d %.1f", aSum, (double)bSum / bCnt);
    }
}