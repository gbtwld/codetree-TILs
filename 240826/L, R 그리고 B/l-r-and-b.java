import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int lx = 0, ly = 0, bx = 0, by = 0;
        char[][] arr = new char[10][10];
        for (int i = 0; i < 10; i++) {
            String input = br.readLine();
            for (int j = 0; j < 10; j++) {
                arr[i][j] = input.charAt(j);
                if (arr[i][j] == 'L') {
                    lx = j;
                    ly = i;
                } else if (arr[i][j] == 'B') {
                    bx = j;
                    by = i;
                }
            }
        }

        sb.append(Math.abs(lx - bx) + Math.abs(ly - by) - 1);
        System.out.println(sb);
    }
}