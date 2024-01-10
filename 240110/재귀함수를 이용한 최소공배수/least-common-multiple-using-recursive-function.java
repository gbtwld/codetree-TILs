import java.util.Scanner;

public class Main {
    public static int[] arr = new int[10];

    public static int gcd(int a, int b) {
        int result = 0;

        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;
    }

    public static int lcm(int index) {
        int result = 1;

        if (index == 1) {
            return (arr[0] * arr[1]) / gcd(arr[0], arr[1]);
        }

        for (int i = 0; i <= index; i++) {
            result *= arr[i];
        }

        return  result / gcd(lcm(index - 1), arr[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(lcm(n - 1));
    }
}