import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a == 'a') {
            a = 'z';
        } else {
            a--;
        }

        System.out.print(a);
    }
}