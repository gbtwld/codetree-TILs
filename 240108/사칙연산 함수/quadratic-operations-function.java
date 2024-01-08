import java.util.Scanner;

public class Main {
    public static void plus(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    public static void minus(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, a - b);
    }

    public static void divide(int a, int b) {
        System.out.printf("%d / %d = %d", a, b, a / b);
    }

    public static void prod(int a, int b) {
        System.out.printf("%d * %d = %d", a, b, a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        
        if (b == '+') {
            plus(a, c);
        } else if (b == '-') {
            minus(a, c);
        } else if (b == '/') {
            divide(a, c);
        } else if (b == '*') {
            prod(a, c);
        }
    }
}