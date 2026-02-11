import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] prefix = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long b = Long.parseLong(br.readLine());
            sum += b;
            prefix[i] = sum;
        }

        for (int i = 0; i < q; i++) {
            long t = Long.parseLong(br.readLine());

            if (t >= prefix[n - 1]) {
                sb.append(n).append('\n');
                continue;
            }

            int lo = 0;
            int hi = n - 1;
            int ans = n - 1;

            while (lo <= hi) {
                int mid = (lo + hi) >>> 1;
                if (prefix[mid] > t) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            sb.append(ans + 1).append('\n');
        }

        System.out.print(sb.toString());
    }
}
