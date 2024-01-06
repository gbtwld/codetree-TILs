import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int cnt = 0;
        String[] arr = new String[200];

        while (true) {
            if ((a = sc.next()).equals("0")) {
                break;
            }
            cnt++;
            arr[cnt] = a;
        }

        System.out.println(cnt);
        for (int i = 1; i <= cnt; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}