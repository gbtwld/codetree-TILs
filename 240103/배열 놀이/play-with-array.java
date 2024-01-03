import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt(), qCategory, qa, qb, idx = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            qCategory = sc.nextInt();
            idx = -1;
            if (qCategory == 3) {
                qa = sc.nextInt();
                qb = sc.nextInt();
                for (int j = qa - 1; j <= qb - 1; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            } else {
                qa = sc.nextInt();
                if (qCategory == 1) {
                    System.out.println(arr[qa - 1]);
                } else if (qCategory == 2) {
                    for (int j = 0; j < n; j++) {
                        if (arr[j] == qa) {
                            idx = j;
                            break;
                        }
                    }
                    System.out.println(idx + 1);
                }
            }
        }
    }
}