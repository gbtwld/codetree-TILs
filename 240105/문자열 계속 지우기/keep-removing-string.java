import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        boolean satisfied = true;

        while(satisfied) {
            for (int i = 0; i < a.length() - (b.length() - 1); i++) {
                satisfied = true;
                if (a.charAt(i) == b.charAt(0)) {
                    for (int j = 1; j < b.length(); j++) {
                        if (a.charAt(i + j) != b.charAt(j)) {
                            satisfied = false;
                            break;
                        }
                    }
                    if (satisfied) {
                        if (a.length() == b.length()) {
                            a = "";
                            satisfied = false;
                            break;
                        }
                        a = a.substring(0, i) + a.substring(i + b.length(), a.length());
                        break;
                    }
                } else {
                    satisfied = false;
                }
            }
        }

        System.out.print(a);
    }
}