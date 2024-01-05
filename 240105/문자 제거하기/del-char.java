import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx;

        while (str.length() > 1) {
            idx = sc.nextInt();
            
            if (idx > str.length() - 1) {
                str = str.substring(0, str.length() - 1);
            } else {
                str = str.substring(0, idx) + str.substring(idx + 1, str.length());
            }

            System.out.println(str);
        }
    }
}