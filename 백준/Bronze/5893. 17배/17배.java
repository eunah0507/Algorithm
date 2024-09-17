import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger num = new BigInteger(br.readLine(), 2);

        Stack<BigInteger> stack = new Stack<>();

        num = num.multiply(BigInteger.valueOf(17));

        while(true) {
            stack.push(num.remainder(BigInteger.valueOf(2)));
            num = num.divide(BigInteger.valueOf(2));

            if(num.equals(BigInteger.ONE)) {
                stack.push(num);

                break;
            }
        }

        while(!stack.isEmpty()) {
            BigInteger S = stack.pop();
            sb.append(S);
        }

        System.out.println(sb.toString());
    }
}
