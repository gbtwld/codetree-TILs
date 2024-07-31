import java.util.*;
import java.io.*;

public class Main {
    public static boolean upVCheck(int x, int curDist, int curV) {
        curV++;
        while (curDist < x) {
            curDist += curV;
            curV--;
        }

        if (curV <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int curDist = 0;
        int curV = 1;
        int time = 0;
        
        while (curDist < x) {
            curDist += curV;
            if (upVCheck(x, curDist, curV)) {
                curV++;
            } else {
                curV--;
            }
            time++;
        }

        sb.append(time);
        System.out.println(sb);
    }
}