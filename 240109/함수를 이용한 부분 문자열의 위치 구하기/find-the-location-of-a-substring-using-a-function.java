import java.util.Scanner;

public class Main {
    public static String str1, str2;

    public static int bubunIndex() {
        int index = -1;

        for (int i = 0; i < str1.length() - str2.length() + 1; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                index = i;
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        index = -1;
                        break;
                    }
                }
                if (index != -1) {
                    return index;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();

        System.out.print(bubunIndex());
    }
}