import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), curIdx = n * 100, wCnt = 0, kCnt = 0, gCnt = 0;
        int[] arrW = new int[n * 100 * 2];
        int[] arrK = new int[n * 100 * 2];
        int[] arrG = new int[n * 100 * 2];
        
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            char dir = sc.next().charAt(0);

            // 회색되면 해당 타일 숫자 빼줘야댐
            // 같은 색으로 다시 칠하는 경우 (number == 1)

            if (dir == 'L') {
                for (int j = number - 1; j >= 0; j--) {
                    int targetIdx = curIdx - (number - (j + 1));

                    arrW[targetIdx] = Math.abs(arrW[targetIdx]) + 1;
                    arrK[targetIdx] *= -1;
                }

                curIdx -= number - 1;
            } else if (dir == 'R') {
                for (int j = 0; j < number; j++) {
                    int targetIdx = curIdx + j;

                    arrK[targetIdx] = Math.abs(arrK[targetIdx]) + 1;
                    arrW[targetIdx] *= -1;
                }

                curIdx += number - 1;
            }
        }

        for (int i = 0; i < arrW.length; i++) {
            if (Math.abs(arrW[i]) >= 2 && Math.abs(arrK[i]) >= 2) {
                gCnt++;
            } else if (arrW[i] > arrK[i]) {
                wCnt++;
            } else if (arrK[i] > arrW[i]) {
                kCnt++;
            }
        }

        System.out.printf("%d %d %d", wCnt, kCnt, gCnt);
    }
}