import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean isBeautiful(int idx, int[] A, int[] B) {
        int[] sortedArr = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            sortedArr[i] = A[idx + i];
        }
        Arrays.sort(sortedArr);
        Arrays.sort(B);
        
        for (int i = 0; i < B.length; i++) {
            if (sortedArr[i] != B[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), cnt = 0;
        int[] arrA = new int[n], arrB = new int[m];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int i = 0; i < n - m + 1; i++) {
            if (isBeautiful(i ,arrA, arrB)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}