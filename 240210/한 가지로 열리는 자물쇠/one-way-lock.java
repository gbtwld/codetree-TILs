import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] answer = new int[3];

        for (int i = 0; i < 3; i++) {
            answer[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.abs(i - answer[0]) <= 2 || Math.abs(j - answer[1]) <= 2 || Math.abs(k - answer[2]) <= 2) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}