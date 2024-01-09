import java.util.Scanner;

public class Main {
    public static int n, m, sum = 0;
    public static int[] arr = new int[100];

    public static void function() {
        while(m > 0) {
            sum += arr[m - 1];
            if (m % 2 != 0) {
                m -= 1;
            } else {
                m /= 2;
            }
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        function();
    }
}