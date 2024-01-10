import java.util.Scanner;

class Meeting {
    String secretCode;
    char meetingPoint;
    int time;

    public Meeting(String sec, char mp, int time) {
        this.secretCode = sec;
        this.meetingPoint = mp;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Meeting meet = new Meeting(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.println("secret code : " + meet.secretCode);
        System.out.println("meeting point : " + meet.meetingPoint);
        System.out.println("time : " + meet.time);
    }
}