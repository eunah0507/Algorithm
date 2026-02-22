import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final long MOD = 1_000_000_007L;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long total = modPow(m, n);
        long without = modPow(m - 1, n);
        long ans = (total - without) % MOD;
        if (ans < 0) {
            ans += MOD;
        }

        sb.append(ans);
        System.out.print(sb.toString());
    }

    private static long modPow(long base, long exp) {
        base %= MOD;
        if (base < 0) {
            base += MOD;
        }

        long result = 1L;
        long cur = base;

        while (exp > 0) {
            if ((exp & 1L) == 1L) {
                result = (result * cur) % MOD;
            }
            cur = (cur * cur) % MOD;
            exp >>= 1;
        }

        return result;
    }
}