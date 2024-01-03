import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num;
        int[] arr = new int[10];

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr[num]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}