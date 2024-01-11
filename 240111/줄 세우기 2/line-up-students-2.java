import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student> {
    int h, w, number;

    public Student(int h, int w, int number) {
        this.h = h;
        this.w = w;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if (this.h == student.h) {
            return student.w - this.w;
        }
        return this.h - student.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", arr[i].h, arr[i].w, arr[i].number);
        }
    }
}