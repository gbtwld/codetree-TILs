import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MIN = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int maxVal = INT_MIN;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal);
    }
}