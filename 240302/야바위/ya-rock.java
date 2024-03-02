import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxPoint = Integer.MIN_VALUE;
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        for (int i = 1; i <= 3; i++) {
            int point = 0;
            int[] stone = new int[4];
            stone[i] = 1;
            
            for (int j = 0; j < n; j++) {
                int a = arr[j][0], b = arr[j][1], c = arr[j][2];

                int tmp = stone[a];
                stone[a] = stone[b];
                stone[b] = tmp;
                
                if (stone[c] == 1) {
                    point++;
                }
            }

            maxPoint = Math.max(maxPoint, point);
        }

        System.out.print(maxPoint);
    }
}