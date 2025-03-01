import java.util.*;
import java.io.*;

public class Main {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            points[i] = new Point(x, y);
        }

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]) - 1; // 1-based index -> 0-based index
            int dv = Integer.parseInt(input[1]);

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double distance = Math.sqrt(Math.pow(points[i].x - points[j].x, 2) +
                                                Math.pow(points[i].y - points[j].y, 2));
                    if (distance <= dv) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}
