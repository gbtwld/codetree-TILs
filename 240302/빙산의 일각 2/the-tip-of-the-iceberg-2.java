import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minH = Integer.MAX_VALUE, maxH = Integer.MIN_VALUE;
        int[] height = new int[n];

        int ans = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            minH = Math.min(minH, height[i]);
            maxH = Math.max(maxH, height[i]);
        }

        for (int k = minH; k <= maxH; k++) {
            int cnt = 0;
            boolean visible = false;

            for (int i = 0; i < n; i++) {
                if (height[i] > k) {
                    if (visible) {
                        continue;
                    } else {
                        cnt++;
                        visible = true;
                    }
                } else {
                    visible = false;
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}