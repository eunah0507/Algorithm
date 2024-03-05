import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        num /= 2;

        BigInteger answer = BigInteger.valueOf(1);

        for (int i = 1; i <= num*2-1; i+=2) {
            answer = answer.multiply(BigInteger.valueOf(i));
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}