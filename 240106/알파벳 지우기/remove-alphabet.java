import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), aNum = "", bNum = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                aNum = aNum + a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                bNum = bNum + b.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(aNum) + Integer.parseInt(bNum));
    }
}