import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Person {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
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

        Arrays.sort(arr, (a, b) -> a.height - b.height);

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", arr[i].name, arr[i].height, arr[i].weight);
        }
    }
}