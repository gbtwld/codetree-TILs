import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int length = j - i + 1;
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                double avg = (double) sum / length;
                
                for (int k = i; k <= j; k++) {
                    if (avg == arr[k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}