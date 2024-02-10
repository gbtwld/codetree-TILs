import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, minDiff = Integer.MAX_VALUE;
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 6; k++) {
                    int sumA = arr[i] + arr[j] + arr[k];
                    int sumB = sum - sumA;
                    
                    minDiff = Math.min(minDiff, Math.abs(sumA - sumB));
                }
            }
        }

        System.out.print(minDiff);
    }
}