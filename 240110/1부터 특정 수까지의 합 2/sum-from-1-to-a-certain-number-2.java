import java.util.Scanner;

public class Main {
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        
        return getSum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(getSum(n));
    }
}