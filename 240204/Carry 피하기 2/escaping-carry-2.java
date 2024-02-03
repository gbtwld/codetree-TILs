import java.util.Scanner;

// 서로 다른 3개의 숫자. 각 자리를 더했을 때 10을 넘지 않아야 함. 합의 최댓값 계산
public class Main {
    public static boolean checkCarry(int a, int b, int c) {
        boolean satisfied = true;
        
        while (a > 0 || b > 0 || c > 0) {
            if (a % 10 + b % 10 + c % 10 >= 10) {
                satisfied = false;
                break;
            }
            a /= 10;
            b /= 10;
            c /= 10;
        }

        return satisfied;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = -1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (checkCarry(arr[i], arr[j], arr[k])) {
                        result = Math.max(result, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.print(result);
    }
}