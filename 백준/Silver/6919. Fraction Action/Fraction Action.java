import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static long gcd(long a, long b) {
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

        long n = Long.parseLong(br.readLine());
        long d = Long.parseLong(br.readLine());

        if (n == 0) {
            sb.append(0);
        } else {
            long whole = n / d;
            long r = n % d;

            if (r == 0) {
                sb.append(whole);
            } else {
                long g = gcd(r, d);
                r /= g;
                d /= g;

                if (whole == 0) {
                    sb.append(r).append("/").append(d);
                } else {
                    sb.append(whole).append(" ").append(r).append("/").append(d);
                }
            }
        }

        System.out.print(sb.toString());
    }
}