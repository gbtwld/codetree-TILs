import java.util.Scanner;

class Agent {
    char code;
    int point;

    public Agent(char code, int point) {
        this.code = code;
        this.point = point;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] arr = new Agent[5];
        int minPointIdx = 0;

        for (int i = 0; i < 5; i++) {
            char code = sc.next().charAt(0);
            int point = sc.nextInt();

            arr[i] = new Agent(code, point);

            if (arr[minPointIdx].point > arr[i].point) {
                minPointIdx = i;
            }
        }

        System.out.print(arr[minPointIdx].code + " " + arr[minPointIdx].point);


    }
}