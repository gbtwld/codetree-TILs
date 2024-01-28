import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), result = 0;
        char[][] arr = new char[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        /*
        1. 색이 다른 곳으로 이동해야함
        2. 오른쪽, 아래쪽으로 한칸 이상 떨어진 곳으로 이동해야함
        3. 시작, 도착 지점 제외 2곳만 지나야함
        */
        if (arr[0][0] == arr[r - 1][c - 1]) {
            System.out.print(0);
            return;
        }
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (arr[i][j] != arr[0][0]) {
                    for (int k = i + 1; k < r - 1; k++) {
                        for (int l = j + 1; l < c - 1; l++) {
                            if (arr[k][l] == arr[0][0]) {
                                result++;
                            }
                        }
                    }
                }
            }
        }

        System.out.print(result);
    }
}