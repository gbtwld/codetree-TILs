import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), result = -1;
        int[] arr = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            arr[num]++;
            if (arr[num] == k) {
                result = num;
                break;
            }
        }

        System.out.print(result);
    }
}