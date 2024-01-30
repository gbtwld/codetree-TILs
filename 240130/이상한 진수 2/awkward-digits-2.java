import java.util.Scanner;

public class Main {
    public static int toTwo(String n) {
        return Integer.valueOf(n, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int maxVal = Integer.MIN_VALUE;
        
        for (int i = 1; i < a.length(); i++) {
            String b = a;
            if (b.charAt(i) == '0') {
                b = b.substring(0, i) + '1' + b.substring(i + 1, b.length());
            } else {
                b = b.substring(0, i) + '0' + b.substring(i + 1, b.length());
            }
            int binary = toTwo(b);
            if (binary > maxVal) maxVal = binary;
        }

        System.out.print(maxVal);
    }
}