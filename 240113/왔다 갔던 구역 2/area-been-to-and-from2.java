import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), curIdx = 1000, length = 0;
        int[] arr = new int[2000];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') {
                for (int j = curIdx; j <= curIdx + x - 1; j++) {
                    arr[j]++;
                }
                curIdx += x;
            } else {
                for (int j = curIdx; j >= curIdx - x + 1; j--) {
                    arr[j]++;
                }
                curIdx -= x;
            }
        }

        for (int i = 0; i < 2000; i++) {
            if (arr[i] >= 2) {
                length++;
            }
        }

        System.out.print(length);
    }
}