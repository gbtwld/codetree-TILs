import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int[] arr1 = new int[n1], arr2 = new int[n2];
        boolean satisfied = true, result = false;

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n1 - n2 + 1; i++) {
            satisfied = true;
            if (arr1[i] == arr2[0]) {
                for (int j = 1; j < n2; j++) {
                    if (arr2[j] != arr1[i + j]) {
                        satisfied = false;
                    }
                }
                if (satisfied) {
                    result = true;
                }
            }
        }

        System.out.print(result ? "Yes" : "No");
    }
}