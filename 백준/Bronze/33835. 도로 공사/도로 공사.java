import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        long x1 = 0L;
        long y1 = 0L;
        long xN = 0L;
        long yN = 0L;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            if (i == 1) {
                x1 = x;
                y1 = y;
            }
            if (i == n) {
                xN = x;
                yN = y;
            }
        }

        double dx = (double) (x1 - xN);
        double dy = (double) (y1 - yN);
        double dist = Math.hypot(dx, dy);

        sb.append(String.format(java.util.Locale.US, "%.10f", dist));
        System.out.println(sb.toString());
    }
}
