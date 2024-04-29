import java.util.Scanner;

public class Main {
    public static int countMax(int[] xArr, int[] yArr, int x, int y) {
        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 0; i < xArr.length; i++) {
            if (xArr[i] > x && yArr[i] > y) {
                a++;
            } else if (xArr[i] < x && yArr[i] > y) {
                b++;
            } else if (xArr[i] < x && yArr[i] < y) {
                c++;
            } else if (xArr[i] > x && yArr[i] < y) {
                d++;
            }
        }

        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = Integer.MAX_VALUE;
        int[] x = new int[n], y = new int[n];
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            minX = Math.min(minX, x[i]);
            minY = Math.min(minY, y[i]);
            maxX = Math.max(maxX, x[i]);
            maxY = Math.max(maxY, y[i]);
        }

        for (int i = minX + 1; i < maxX; i += 2) {
            for (int j = minY + 1; j < maxY; j += 2) {
                int cnt = countMax(x, y, i, j);

                result = Math.min(result, cnt);
            }
        }

        System.out.println(result);
    }
}