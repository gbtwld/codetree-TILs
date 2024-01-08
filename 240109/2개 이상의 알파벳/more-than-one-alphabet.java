import java.util.Scanner;

public class Main {
    public static boolean alpha(String a) {
        int[] arr = new int[a.length()];
        int cnt = 0;
        boolean satisfied = true;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (a.charAt(i) == arr[j]) {
                    satisfied = false;
                    break;
                }
            }
            if (satisfied) {
                cnt++;
            }
        }

        return cnt >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (alpha(a)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}