import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger totalApple = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger two = new BigInteger("2");

        BigInteger nataliaApple = (totalApple.subtract(diff)).divide(two);
        BigInteger claudiaApple = nataliaApple.add(diff);

        sb.append(claudiaApple).append("\n").append(nataliaApple);
        System.out.println(sb);
    }
}
