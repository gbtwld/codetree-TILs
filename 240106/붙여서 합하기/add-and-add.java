import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        int ab = Integer.parseInt(a + b), ba = Integer.parseInt(b + a);

        System.out.print(ab + ba);
    }
}