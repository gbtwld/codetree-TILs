import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 500; j++) {
                if (a * i + b * j <= c) {
                    maxVal = Math.max(maxVal, a * i + b * j);
                }
            }
        }

        System.out.print(maxVal);
    }
}