import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Person {
    String name;
    int h;
    double w;

    public Person(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] arr = new Person[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(arr, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", arr[i].name, arr[i].h, arr[i].w);
        }
        System.out.println();

        Arrays.sort(arr, (a, b) -> b.h - a.h);
        System.out.println("height");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", arr[i].name, arr[i].h, arr[i].w);
        }
    }
}