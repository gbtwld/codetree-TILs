import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0;
        int[] x1 = new int[n], x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean satisfied = true;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                if (x1[i] < x1[j] && x2[i] > x2[j] || x1[i] > x1[j] && x2[i] < x2[j]) {
                    satisfied = false;
                }
            }

            if (satisfied) {
                result++;
            }
        }

        System.out.print(result);
    }
}