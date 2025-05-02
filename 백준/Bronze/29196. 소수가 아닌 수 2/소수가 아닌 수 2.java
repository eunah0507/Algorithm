import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigDecimal k = new BigDecimal(br.readLine());
        BigDecimal eps = new BigDecimal("1e-6");

        boolean found = false;
        int maxQ = 1_000_000;
        for (int q = 1; q <= maxQ; q++) {
            BigDecimal bigQ = new BigDecimal(q);
            BigDecimal pDecimal = k.multiply(bigQ);
            BigDecimal p = pDecimal.setScale(0, BigDecimal.ROUND_HALF_UP);  

            BigDecimal actual = p.divide(bigQ, 15, BigDecimal.ROUND_HALF_UP);
            BigDecimal diff = actual.subtract(k).abs();

            if (diff.compareTo(eps) <= 0) {
                sb.append("YES\n").append(p.toBigInteger()).append(" ").append(q);
                found = true;
                break;
            }
        }

        if (!found) {
            sb.append("NO");
        }

        System.out.println(sb.toString());
    }
}
