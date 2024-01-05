import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.next().toCharArray(), arr2 = sc.next().toCharArray();

        arr2[0] = arr1[0];
        arr2[1] = arr1[1];

        String result = String.valueOf(arr2);

        System.out.print(result);
    }
}