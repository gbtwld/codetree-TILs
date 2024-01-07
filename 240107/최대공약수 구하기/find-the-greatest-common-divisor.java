import java.util.Scanner;

public class Main {
    public static void getNum(int n, int m) {
        int result = 0;

        if (n > m) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0) {
                    result = i;
                }
            }
        } else {
            for (int i = 1; i <= m; i++) {
                if (n % i == 0 && m % i == 0) {
                    result = i;
                }
            }
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        
        getNum(n, m);
    }
}