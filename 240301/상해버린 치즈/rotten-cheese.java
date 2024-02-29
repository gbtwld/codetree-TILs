import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람 수
        int m = sc.nextInt(); // 치즈 수
        int d = sc.nextInt(); // 먹은 기록 수
        int s = sc.nextInt(); // 아픈 기록 수

        int[][] arr1 = new int[d][3];
        int[][] arr2 = new int[s][2];

        boolean[] cheese = new boolean[m];

        int maxPatient = Integer.MIN_VALUE;
        
        /*
        D개 줄
        p => 몇 번째 사람
        m => 몇 번째 치즈
        t => 언제 먹었는지

        S개 줄
        p => 몇 번째 사람
        t => 언제 아팠는지
        */

        for (int i = 0; i < d; i++) {
            arr1[i][0] = sc.nextInt();
            arr1[i][1] = sc.nextInt();
            arr1[i][2] = sc.nextInt();
        }
        for (int i = 0; i < s; i++) {
            arr2[i][0] = sc.nextInt();
            arr2[i][1] = sc.nextInt();
        }
        
        // 치즈가 상했다고 가정, 상한 치즈 일 수 없으면 정상 치즈, 아픈사람 중에 안먹은 사람이 있으면 정상
        for (int i = 1; i <= m; i++) {
            boolean everyoneAte = true;
            for (int j = 0; j < s; j++) {
                int person = arr2[j][0];
                int eatTime = arr2[j][1];
                boolean satisfied = false;

                for (int k = 0; k < d; k++) {
                    if (arr1[k][0] == person && arr1[k][1] == i && arr1[k][2] < eatTime) {
                        satisfied = true;
                    }
                }
                
                if (!satisfied) {
                    everyoneAte = false;
                }
            }
            if (!everyoneAte) continue;

            cheese[i - 1] = true;
        }

        for (int i = 0; i < m; i++) {
            if (!cheese[i]) continue;

            int cnt = 0;
            int[] eatPersonArr = new int[n];

            for (int j = 0; j < d; j++) {
                if (arr1[j][1] == i + 1) {
                    eatPersonArr[arr1[j][0] - 1]++;
                }
            }
            for (int k = 0; k < n; k++) {
                if (eatPersonArr[k] > 0) cnt++;
            }
            maxPatient = Math.max(maxPatient, cnt);
        }

        System.out.print(maxPatient);
    }
}