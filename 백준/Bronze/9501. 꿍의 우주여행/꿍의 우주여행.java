import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        for (int tc = 0; tc < t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long d = Long.parseLong(st.nextToken());

            int count = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                long v = Long.parseLong(st.nextToken());
                long f = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());

                long left = c * d;
                long right = f * v;

                if (left <= right) {
                    count++;
                }
            }

            sb.append(count);
            if (tc + 1 < t) {
                sb.append('\n');
            }
        }

        System.out.print(sb);
    }
}
