import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Person {
    String name;
    int h;
    int w;

    public Person(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.h == b.h) {
                return b.w - a.w;
            }
            return a.h - b.h;
        });

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", arr[i].name, arr[i].h, arr[i].w);
        }
    }
}