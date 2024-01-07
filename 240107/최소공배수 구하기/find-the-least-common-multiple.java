import java.util.Scanner;

public class Main {
    public static void printResult(int n, int m) {
        int result = n > m ? n : m;
        while (true) {
            if (result % n == 0 && result % m == 0) {
                break;
            }
            result++;
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        printResult(n, m);
    }
}