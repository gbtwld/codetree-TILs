import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int idx = -1;
        char input = sc.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            if (arr[i] == input) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.print("None");
        } else {
            System.out.print(idx);
        }
    }
}