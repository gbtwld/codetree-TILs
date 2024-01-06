import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        String result = Integer.toString(sum);
        result = result.substring(1, result.length()) + result.substring(0, 1);
        System.out.print(result);
    }
}