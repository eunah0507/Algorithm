import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // long도 받을 수 없을만큼 수가 크므로
        BigInteger num = new BigInteger(br.readLine());
        // 실수한 위치
        int answer = 64;

        while (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
            num = num.divide(BigInteger.TWO);
            answer--;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
