import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int q = sc.nextInt(), category;
        int a1, b1;
        char a2, b2;

        for (int i = 0; i < q; i++) {
            category = sc.nextInt();
            if (category == 1) {
                a1 = sc.nextInt();
                b1 = sc.nextInt();
                char tmp = arr[a1 - 1];

                arr[a1 - 1] = arr[b1 - 1];
                arr[b1 - 1] = tmp;

                String result = String.valueOf(arr);

                System.out.println(result);
            } else if (category == 2) {
                a2 = sc.next().charAt(0);
                b2 = sc.next().charAt(0);

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == a2) {
                        arr[j] = b2;
                    }
                }

                String result = String.valueOf(arr);

                System.out.println(result);
            }
        }
    }
}