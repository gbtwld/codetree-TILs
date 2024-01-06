import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a == 'z') {
            a = 'a';
        } else {
            a++;
        }

        System.out.print(a);
    }
}