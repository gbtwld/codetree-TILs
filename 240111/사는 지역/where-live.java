import java.util.Scanner;
import java.util.Arrays;

class Person {
    String name, address, city;
    
    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxNameIdx = 0;
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Person(sc.next(), sc.next(), sc.next());
            if (arr[maxNameIdx].name.charAt(0) < arr[i].name.charAt(0)) {
                maxNameIdx = i;
            }
        }

        System.out.println("name " + arr[maxNameIdx].name);
        System.out.println("addr " + arr[maxNameIdx].address);
        System.out.println("city " + arr[maxNameIdx].city);
    }
}