import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        long best = Long.MAX_VALUE;
        int aa = 1, bb = 1, cc = n;

        int limA = (int) Math.cbrt(n);
        for (int a = 1; a <= limA; a++) {
            if (n % a != 0) continue;
            int m = n / a;
            int limB = (int) Math.sqrt(m);
            for (int b = a; b <= limB; b++) {
                if (m % b != 0) continue;
                int c = m / b;
                long s = 2L * ((long)a*b + (long)b*c + (long)c*a);
                if (s < best) {
                    best = s;
                    aa = a; bb = b; cc = c;
                }
            }
        }

        String answer = aa + " " + bb + " " + cc;
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
