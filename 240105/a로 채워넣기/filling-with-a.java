import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 1. char array
        /*
        char[] arr = str.toCharArray();

        arr[1] = 'a';
        arr[arr.length - 2] = 'a';

        String result = String.valueOf(arr);

        System.out.print(result);
        */
        
        // 2. substring
        String result = str.substring(0, 1) + 'a' + str.substring(2, str.length() - 2) + 'a' + str.charAt(str.length() - 1);

        System.out.print(result);
    }
}