import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student> {
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if (student.height == this.height) {
            if (student.weight == this.weight) {
                return this.number - student.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
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
            System.out.printf("%d %d %d\n", arr[i].height, arr[i].weight, arr[i].number);
        }
    }
}