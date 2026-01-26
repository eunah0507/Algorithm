import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine().trim();

        int dot = s.indexOf('.');
        long p;
        long q;

        if (dot == -1) {
            p = Long.parseLong(s);
            q = 1L;
        } else {
            String frac = s.substring(dot + 1);
            q = 1L;
            for (int i = 0; i < frac.length(); i++) {
                q *= 10L;
            }
            String digits = s.substring(0, dot) + frac;
            p = Long.parseLong(digits);
        }

        long g = gcd(p, q);
        p /= g;
        q /= g;

        sb.append("YES\n");
        sb.append(p).append(' ').append(q).append('\n');
        System.out.print(sb.toString());
    }
}
