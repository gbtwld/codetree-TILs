import java.util.Scanner;

public class Main {
    public static void printNLines(int n) {
        String a = "12345^&*()_";
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printNLines(num);
    }
}