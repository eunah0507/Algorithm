import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] tokens = br.readLine().split(" ");
		BigInteger r = new BigInteger(tokens[0]);
		BigInteger k = new BigInteger(tokens[1]);
		BigInteger m = new BigInteger(tokens[2]);

        // 몇 번 반감되었는가
		BigInteger n = m.divide(k); 
		BigInteger two = BigInteger.valueOf(2);
        // 2^n
		BigInteger divisor = two.pow(n.intValue()); 

		BigInteger reward = r.divide(divisor);
		sb.append(reward);

		System.out.println(sb.toString());
	}
}
