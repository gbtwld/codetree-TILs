import java.util.Scanner;

public class Main {
    public static int[] arr = new int[10];

    public static int gcd(int num1, int num2){
        return num2 > 0 ? gcd(num2, num1 % num2) : num1;
    }

    public static int lcm(int num1, int num2){
        return num1 * num2 / gcd(num1, num2);
    }

    public static int getLcm(int n) {
        if (n == 1) {
            return lcm(arr[1], arr[0]);
        }
        System.out.println(n);
        return lcm(arr[n], getLcm(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(getLcm(n - 1));
    }
}