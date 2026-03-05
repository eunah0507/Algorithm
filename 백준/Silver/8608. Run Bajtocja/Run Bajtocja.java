import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(br.readLine());
        }

        int[] maxExp = new int[501];
        for (int i = 0; i < n; i++) {
            int x = t[i];
            for (int p = 2; p * p <= x; p++) {
                if (x % p == 0) {
                    int cnt = 0;
                    while (x % p == 0) {
                        x /= p;
                        cnt++;
                    }
                    if (maxExp[p] < cnt) {
                        maxExp[p] = cnt;
                    }
                }
            }
            if (x > 1) {
                if (maxExp[x] < 1) {
                    maxExp[x] = 1;
                }
            }
        }

        BigInteger lcm = BigInteger.ONE;
        for (int p = 2; p <= 500; p++) {
            if (maxExp[p] > 0) {
                BigInteger base = BigInteger.valueOf(p);
                for (int i = 0; i < maxExp[p]; i++) {
                    lcm = lcm.multiply(base);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(lcm.divide(BigInteger.valueOf(t[i]))).append('\n');
        }

        System.out.print(sb.toString());
    }
}