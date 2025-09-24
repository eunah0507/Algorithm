import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int y1 = Integer.parseInt(st1.nextToken());
        int m1 = Integer.parseInt(st1.nextToken());
        int d1 = Integer.parseInt(st1.nextToken());

        int y2 = Integer.parseInt(st2.nextToken());
        int m2 = Integer.parseInt(st2.nextToken());
        int d2 = Integer.parseInt(st2.nextToken());

        if (y2 > y1 + 1000 || (y2 == y1 + 1000 && (m2 > m1 || (m2 == m1 && d2 >= d1)))) {
            System.out.println("gg");
            return;
        }

        int[] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        int start = 0;
        for (int i = 1; i < y1; i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) start += 366;
            else start += 365;
        }
        for (int i = 1; i < m1; i++) {
            if (i == 2 && ((y1 % 400 == 0) || (y1 % 4 == 0 && y1 % 100 != 0))) start += 29;
            else start += monthDays[i];
        }
        start += d1;

        int end = 0;
        for (int i = 1; i < y2; i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) end += 366;
            else end += 365;
        }
        for (int i = 1; i < m2; i++) {
            if (i == 2 && ((y2 % 400 == 0) || (y2 % 4 == 0 && y2 % 100 != 0))) end += 29;
            else end += monthDays[i];
        }
        end += d2;

        StringBuilder sb = new StringBuilder();
        sb.append("D-").append(end - start);
        System.out.println(sb.toString());
    }
}