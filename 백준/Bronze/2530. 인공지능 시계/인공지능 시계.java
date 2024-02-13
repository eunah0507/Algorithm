import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int second = sc.nextInt();
        int plusSecond = sc.nextInt();

        int totalSeconds = second + minutes * 60 + hour * 3600 + plusSecond;

        int endHour = (totalSeconds / 3600) % 24;
        int endMinute = (totalSeconds % 3600) / 60;
        int endSecond = totalSeconds % 60;

        sb.append(endHour);
        sb.append(" ");
        sb.append(endMinute);
        sb.append(" ");
        sb.append(endSecond);

        System.out.println(sb.toString());
    }
}
