import java.util.Scanner;

public class Main {
    public static int f(int n) {
        if (n <= 2) {
            return n;
        }
        
        return n + f(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(f(n));
    }
}