import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();

        while(a.indexOf(b) != -1) {
            a = a.substring(0, a.indexOf(b)) + a.substring(a.indexOf(b) + b.length(), a.length());
        }
        
        System.out.print(a);
    }
}