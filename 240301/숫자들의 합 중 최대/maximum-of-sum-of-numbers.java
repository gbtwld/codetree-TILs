import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), result = Integer.MIN_VALUE;

        for (int i = x; i <= y; i++) {
            int val = i, sum = 0;

            while(val > 0) {
                sum += val % 10;
                val /= 10;
            }

            result = Math.max(result, sum);
        }

        System.out.print(result);
    }
}