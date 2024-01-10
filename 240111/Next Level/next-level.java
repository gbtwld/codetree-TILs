import java.util.Scanner;

class Info {
    String id;
    int level;

    public Info() {
        this.id = "codetree";
        this.level = 10;
    }
    
    public Info(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info info1 = new Info(), info2 = new Info(sc.next(), sc.nextInt());

        System.out.println("user " + info1.id + " lv " + info1.level);
        System.out.println("user " + info2.id + " lv " + info2.level);
    }
}