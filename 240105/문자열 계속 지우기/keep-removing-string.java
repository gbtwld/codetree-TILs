import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        int idx = 0;
        boolean satisfied = true;

        while(satisfied) {
            idx = 0;
            for (int i = 0; i < a.length() - 1; i++) {
                satisfied = true;
                if (a.charAt(i) == b.charAt(0)) {
                    for (int j = 1; j < b.length(); j++) {
                        if (a.charAt(i + j) != b.charAt(j)) {
                            satisfied = false;
                            break;
                        }
                        if (j == b.length() - 1) {
                            idx = i + b.length() - 1;
                        }
                    }
                    if (satisfied) {
                        a = a.substring(0, i) + a.substring(idx + 1, a.length());
                        break;
                    }
                } else if (i == a.length() - 2) {
                    satisfied = false;
                    break;
                }
            }
        }

        System.out.print(a);
    }
}