import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(), newStr = "";
        int cnt = 0, idx = 0;

        while(idx < str.length()) {
            cnt = 1;
            newStr = newStr + str.charAt(idx);
            for (int i = idx; i < str.length() - 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    break;
                } else {
                    cnt++;
                }
            }
            idx += cnt;
            newStr = newStr + cnt;
        }

        System.out.println(newStr.length());
        System.out.println(newStr);
    }
}