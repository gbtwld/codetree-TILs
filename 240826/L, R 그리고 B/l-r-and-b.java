import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int lx = 0, ly = 0, bx = 0, by = 0, rx = 0, ry = 0;
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
                } else if (arr[i][j] == 'R') {
                    rx = j;
                    ry = i;
                }
            }
        }

        if (lx == bx) {
            if (lx == rx && (ly < ry && ry < by || by < ry && ry < ly)) {
                sb.append(Math.abs(ly - by) + 1);
            } else {
                sb.append(Math.abs(ly - by) - 1);
            }
        } else if (ly == by) {
            if (ly == ry && (lx < rx && rx < bx || bx < rx && rx < lx)) {
                sb.append(Math.abs(lx - bx) + 1);
            } else {
                sb.append(Math.abs(lx - bx) - 1);
            }
        } else {
            sb.append(Math.abs(lx - bx) + Math.abs(ly - by) - 1);
        }
        System.out.println(sb);
    }
}