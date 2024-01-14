import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2000][2000];
        int offset = 1000, minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt() + offset, y1 = sc.nextInt() + offset, x2 = sc.nextInt() + offset, y2 = sc.nextInt() + offset;
            
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i == 0) {
                        arr[j][k]++;
                    } else {
                        arr[j][k]--;
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0) {
                    sum++;
                    if (minX > i) {
                        minX = i;
                    }
                    if (minY > j) {
                        minY = j;
                    } 
                    if (maxX < i) {
                        maxX = i;
                    } 
                    if (maxY < j) {
                        maxY = j;
                    }
                }
            }
        }

        System.out.print(sum == 0 ? sum : (maxX + 1 - minX) * (maxY + 1 - minY));
    }
}