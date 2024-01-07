import java.util.Scanner;

public class Main {
    public static boolean aFunction(int n) {
        return (n / 10 + n % 10) % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0 && aFunction(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}