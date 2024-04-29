import java.util.*;

public class Main {
    public static boolean checkTwo(int a, int b, int c) {
        if (a == b && b == c) return false;
        if (a != b && b != c && a != c) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[][] arr = new int[3][3];
        List<List<Integer>> visited = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            arr[i][2] = num % 10;
            num /= 10;
            arr[i][1] = num % 10;
            num /= 10;
            arr[i][0] = num;
        }

        for (int i = 0; i < 3; i++) {
            if (checkTwo(arr[i][0], arr[i][1], arr[i][2])) {
                HashSet<Integer> hashSet = new HashSet<>();
                hashSet.add(arr[i][0]);
                hashSet.add(arr[i][1]);
                hashSet.add(arr[i][2]);
                List<Integer> k = new ArrayList<>(hashSet);
                Collections.sort(k);
                if (!visited.contains(k)) {
                    cnt++;
                    visited.add(k);
                }
            }
            if (checkTwo(arr[0][i], arr[1][i], arr[2][i])) {
                HashSet<Integer> hashSet = new HashSet<>();
                hashSet.add(arr[0][i]);
                hashSet.add(arr[1][i]);
                hashSet.add(arr[2][i]);
                List<Integer> k = new ArrayList<>(hashSet);
                Collections.sort(k);
                if (!visited.contains(k)) {
                    cnt++;
                    visited.add(k);
                }
            }
        }

        if (checkTwo(arr[0][0], arr[1][1], arr[2][2])) {
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(arr[0][0]);
            hashSet.add(arr[1][1]);
            hashSet.add(arr[2][2]);
            List<Integer> k = new ArrayList<>(hashSet);
            Collections.sort(k);
            if (!visited.contains(k)) {
                cnt++;
                visited.add(k);
            }
        }
        if (checkTwo(arr[0][2], arr[1][1], arr[2][0])) {
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(arr[0][2]);
            hashSet.add(arr[1][1]);
            hashSet.add(arr[2][0]);
            List<Integer> k = new ArrayList<>(hashSet);
            Collections.sort(k);
            if (!visited.contains(k)) {
                cnt++;
                visited.add(k);
            }
        }

        System.out.println(cnt);
    }
}