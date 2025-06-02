import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger num = new BigInteger(br.readLine());
        BigInteger one = BigInteger.ONE;
        BigInteger k = BigInteger.ONE;

        while (true) {
            BigInteger kSquare = k.multiply(k);
            BigInteger total = kSquare.add(k).add(one);

            if (total.equals(num)) {
                sb.append(k.toString());
                break;
            }
            k = k.add(one);
        }

        System.out.print(sb.toString());
    }
}
