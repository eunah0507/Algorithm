import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

        BigInteger numA = new BigInteger(br.readLine());
        String str = br.readLine();
        BigInteger numB = new BigInteger(br.readLine());

        char ch = str.charAt(0);
        BigInteger answer = BigInteger.valueOf(1);

        if (ch == '*') {
            answer = numA.multiply(numB);
        }else{
            answer = numA.add(numB);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}