import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        long[] result = fib(n);

        sb.append(result[0]);
        System.out.print(sb.toString());
    }

    static long[] fib(long n) {
        if (n == 0) {
            return new long[]{0, 1};
        }

        long[] half = fib(n / 2);

        long a = half[0];
        long b = half[1];

        long c = (a * ((2 * b % MOD - a + MOD) % MOD)) % MOD;
        long d = (a * a % MOD + b * b % MOD) % MOD;

        if (n % 2 == 0) {
            return new long[]{c, d};
        } else {
            return new long[]{d, (c + d) % MOD};
        }
    }
}