import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] h = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                h[i] = Long.parseLong(st.nextToken());
            }

            boolean possible = true;

            for (int i = 0; i < n - 1; i++) {
                long need = Math.max(0L, h[i + 1] - k);

                if (h[i] >= need) {
                    m += h[i] - need;
                } else {
                    long diff = need - h[i];
                    if (m < diff) {
                        possible = false;
                        break;
                    }
                    m -= diff;
                }
            }

            sb.append(possible ? "YES" : "NO").append('\n');
        }

        System.out.print(sb.toString());
    }
}