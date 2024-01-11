import java.util.Scanner;
import java.util.Arrays;

class Num {
    int value, number;

    public Num(int value, int number) {
        this.value = value;
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] arr = new Num[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Num(sc.nextInt(), i + 1);
        }

        Arrays.sort(arr, (a, b) -> a.value - b.value);

        for (int i = 0; i < n; i++) {
            result[arr[i].number - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}