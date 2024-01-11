import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Point {
    int x, y, number;

    public Point(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(arr, (a, b) -> {
            if ((Math.abs(a.x) + Math.abs(a.y)) == (Math.abs(b.x) + Math.abs(b.y))) {
                return a.number - b.number;
            }
            return (Math.abs(a.x) + Math.abs(a.y)) - (Math.abs(b.x) + Math.abs(b.y));
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].number);
        }
    }
}