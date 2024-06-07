import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger numA = new BigInteger(st.nextToken());
        BigInteger numB = new BigInteger(st.nextToken());

        BigInteger answerA = numA.divide(numB);
        BigInteger answerB = numA.remainder(numB);

        sb.append(answerA).append("\n");
        sb.append(answerB).append("\n");

        System.out.println(sb.toString());

    }
}
