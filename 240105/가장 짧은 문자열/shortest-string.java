import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next(), str3 = sc.next();
        int[] lengthArr = new int[]{str1.length(), str2.length(), str3.length()};
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (lengthArr[i] - lengthArr[j] > maxVal) {
                    maxVal = lengthArr[i] - lengthArr[j];
                }
            }
        }

        System.out.print(maxVal);
    }
}