import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int a;
    int b;
    int c;

    public Student(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Student student) {
        return (this.a + this.b + this.c) - (student.a + student.b + student.c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d %d\n", arr[i].name, arr[i].a, arr[i].b, arr[i].c);
        }
    }
}