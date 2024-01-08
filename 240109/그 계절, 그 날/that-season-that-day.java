import java.util.Scanner;

public class Main {
    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summer";
        } else if (m >= 9 && m <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    public static boolean isExist(int y, int m, int d) {
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 4 == 0 && y % 100 == 0 && y % 400 == 0)) {
                return d <= 29;
            }
            return d <= 28;
        } else if (m <= 7) {
            if (m % 2 == 0) {
                return d <= 30;
            } else {
                return d <= 31;
            }
        } else if (m <= 12) {
            if (m % 2 == 0) {
                return d <= 31;
            } else {
                return d <= 30;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
        
        if (isExist(y, m, d)) {
            System.out.print(getSeason(m));
        } else {
            System.out.print(-1);
        }
    }
}