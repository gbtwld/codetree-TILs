import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. char array
        String str = sc.next();
        char[] arr = str.toCharArray();

        arr[1] = 'a';
        arr[arr.length - 2] = 'a';

        String result = String.valueOf(arr);

        System.out.print(result);
    }
}