import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;

        while(true) {
            if ((a = sc.next()).equals("END")) {
                break;
            }
            for (int i = 0; i < a.length(); i++) {
                System.out.print(a.charAt(a.length() - 1 - i));
            }
            System.out.println();
        }
    }
}