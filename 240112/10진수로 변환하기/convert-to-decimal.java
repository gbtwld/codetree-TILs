import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] binary = new int[8];
        int num = 0;
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            binary[i] = (int)input.charAt(i) - (int)'0';
        }

        for (int i = 0; i < input.length(); i++) {
            num = num * 2 + binary[i];
        }

        System.out.print(num);
    }
}