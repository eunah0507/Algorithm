import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());
        int ex = Integer.parseInt(st.nextToken());
        int ey = Integer.parseInt(st.nextToken());

        long minDist = Long.MAX_VALUE;
        int answer = -1;

        for (int i = 1; i <= n; i++) {
            int m = Integer.parseInt(br.readLine().trim());
            int[] xs = new int[m + 2];
            int[] ys = new int[m + 2];

            xs[0] = sx;
            ys[0] = sy;

            for (int j = 1; j <= m; j++) {
                st = new StringTokenizer(br.readLine());
                xs[j] = Integer.parseInt(st.nextToken());
                ys[j] = Integer.parseInt(st.nextToken());
            }

            xs[m + 1] = ex;
            ys[m + 1] = ey;

            long dist = 0;
            for (int j = 0; j < m + 1; j++) {
                dist += Math.abs((long) xs[j] - xs[j + 1]) + Math.abs((long) ys[j] - ys[j + 1]);
            }

            if (dist < minDist) {
                minDist = dist;
                answer = i;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
