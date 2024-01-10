import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        char[] cArr1 = str1.toCharArray(), cArr2 = str2.toCharArray();
        boolean satisfied = true;

        Arrays.sort(cArr1);
        Arrays.sort(cArr2);

        if (cArr1.length != cArr2.length) {
            satisfied = false;
        } else {
            for (int i = 0; i < cArr1.length; i++) {
                if (cArr1[i] != cArr2[i]) {
                    satisfied = false;
                }
            }
        }

        System.out.print(satisfied ? "Yes" : "No");
    }
}