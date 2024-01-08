import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int n) {
        this.value = n;
    }
}

public class Main {
    public static void process(IntWrapper a, IntWrapper b) {
        if (a.value < b.value) {
            a.value += 10;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt()), b = new IntWrapper(sc.nextInt());

        process(a, b);

        System.out.printf("%d %d", a.value, b.value);
    }
}