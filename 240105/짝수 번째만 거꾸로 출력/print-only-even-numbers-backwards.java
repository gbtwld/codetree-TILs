import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(), result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                result = str.charAt(i) + result;
            }
        }

        System.out.print(result);
    }
}