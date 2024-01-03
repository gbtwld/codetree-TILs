import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int[] arr1 = new int[n1], arr2 = new int[n2];
        boolean satisfied = true;

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            if (arr2[0] == arr1[i]) {
                for (int j = 1; j < n2; j++) {
                    if (arr2[j] != arr1[i + j]) {
                        satisfied = false;
                    }
                }
                break;
            }
            if (i == n1 - 1) {
                satisfied = false;
            }
        }

        System.out.print(satisfied ? "Yes" : "No");
    }
}