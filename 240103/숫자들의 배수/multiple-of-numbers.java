import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] arr = new int[100];
        
        for (int i = 0; i < 100; i++) {
            arr[i] = n * (i + 1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 5 == 0) {
                cnt++;
            }
            if (cnt == 2) {
                break;
            }
        }
    }
}