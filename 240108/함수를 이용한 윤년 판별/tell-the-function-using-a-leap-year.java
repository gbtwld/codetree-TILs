import java.util.Scanner;

public class Main {
    public static boolean isYun(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.print(isYun(y));
    }
}