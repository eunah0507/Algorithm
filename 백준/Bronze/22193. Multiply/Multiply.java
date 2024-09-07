import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        
        BigInteger answer = a.multiply(b);
        
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
