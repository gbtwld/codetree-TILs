import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 != 0) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }

        if (oddSum > evenSum) {
            System.out.print(oddSum - evenSum);
        } else {
            System.out.print(evenSum - oddSum);
        }

    }
}