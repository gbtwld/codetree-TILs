import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0), b = sc.next().charAt(0);
        int c = (int) a, d = (int) b;
        
        System.out.print(c + d + " ");
        if (c > d) {
            System.out.print(c - d);
        } else {
            System.out.print(d - c);
        }
    }
}