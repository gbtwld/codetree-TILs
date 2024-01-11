import java.util.Scanner;

class Data {
    String date, day, weather;

    public Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, firstIdx = 0;
        Data[] arr = new Data[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next(), day = sc.next(), weather = sc.next();
            if (weather.equals("Rain")) {
                arr[cnt++] = new Data(date, day, weather);
            }
        }

        for (int i = 0; i < cnt; i++) {
            if (arr[i].date.compareTo(arr[firstIdx].date) < 0) {
                firstIdx = i;
            }
        }

        System.out.print(arr[firstIdx].date + " " + arr[firstIdx].day + " " + arr[firstIdx].weather);
    }
}