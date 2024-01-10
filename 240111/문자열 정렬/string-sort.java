import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] cArr = str.toCharArray();
        Arrays.sort(cArr);
        String sortedStr = new String(cArr);
        System.out.print(sortedStr);
    }
}