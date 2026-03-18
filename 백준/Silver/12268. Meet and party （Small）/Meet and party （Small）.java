import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int b = Integer.parseInt(br.readLine());
            ArrayList<long[]> points = new ArrayList<>();

            for (int i = 0; i < b; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                long x1 = Long.parseLong(st.nextToken());
                long y1 = Long.parseLong(st.nextToken());
                long x2 = Long.parseLong(st.nextToken());
                long y2 = Long.parseLong(st.nextToken());

                for (long x = x1; x <= x2; x++) {
                    for (long y = y1; y <= y2; y++) {
                        points.add(new long[]{x, y});
                    }
                }
            }

            int n = points.size();
            long[] costX = new long[n];
            long[] costY = new long[n];

            for (int i = 0; i < n; i++) {
                long xi = points.get(i)[0];
                long yi = points.get(i)[1];

                long sumX = 0;
                long sumY = 0;

                for (int j = 0; j < n; j++) {
                    long[] p = points.get(j);
                    sumX += Math.abs(xi - p[0]);
                    sumY += Math.abs(yi - p[1]);
                }

                costX[i] = sumX;
                costY[i] = sumY;
            }

            long bestX = 0;
            long bestY = 0;
            long bestD = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long[] p = points.get(i);
                long x = p[0];
                long y = p[1];
                long d = costX[i] + costY[i];

                if (d < bestD || (d == bestD && (x < bestX || (x == bestX && y < bestY)))) {
                    bestD = d;
                    bestX = x;
                    bestY = y;
                }
            }

            sb.append("Case #").append(tc).append(": ")
              .append(bestX).append(' ')
              .append(bestY).append(' ')
              .append(bestD).append('\n');
        }

        System.out.print(sb.toString());
    }
}