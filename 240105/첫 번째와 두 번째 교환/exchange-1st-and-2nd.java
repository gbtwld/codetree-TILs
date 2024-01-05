import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        char a = arr[0], b = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                arr[i] = b;
            } else if (arr[i] == b) {
                arr[i] = a;
            }
        }

        String result = String.valueOf(arr);

        System.out.print(result);
    }
}