import java.util.Scanner;

public class Main {
    public static boolean alpha(String a) {
        int[] arr = new int[200];
        int cnt = 0;

        for (int i = 0; i < a.length(); i++) {
            arr[(int)a.charAt(i)]++;
        }
        for (int i = 0; i < 200; i++) {
            if (arr[i] != 0) {
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