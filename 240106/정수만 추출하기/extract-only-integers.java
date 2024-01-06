import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        int aNum, bNum, idx = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                idx = i;
            }  else {
                break;
            }
        }
        aNum = Integer.parseInt(a.substring(0, idx + 1));
        
        idx = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                idx = i;
            }  else {
                break;
            }
        }
        bNum = Integer.parseInt(b.substring(0, idx + 1));

        System.out.print(aNum + bNum);
    }
}