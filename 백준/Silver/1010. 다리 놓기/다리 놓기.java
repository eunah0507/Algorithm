import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // nCr 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            BigInteger nFac = BigInteger.valueOf(1);
            BigInteger rFac = BigInteger.valueOf(1);
            BigInteger nMinRFac = BigInteger.valueOf(1);
            BigInteger answer = BigInteger.valueOf(1);

            for (int j = 1; j <= n; j++) {
               nFac = nFac.multiply(BigInteger.valueOf(j));
            }

            for (int j = 1; j <= r; j++) {
                rFac = rFac.multiply(BigInteger.valueOf(j));
            }

            for (int j = 1; j <= (n - r); j++) {
                nMinRFac = nMinRFac.multiply(BigInteger.valueOf(j));
            }

            answer = nFac.divide(rFac.multiply(nMinRFac));
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}