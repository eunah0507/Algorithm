import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 3개의 테스트 셋이 주어진다.
        // 각 셋 첫째 줄에는 N이 주어진다.
        // 둘 째줄 부터 N개의 줄에 걸쳐 각 정수가 주어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(br.readLine());
        BigInteger sum = BigInteger.valueOf(0);
        String answer = "";

        for (int i = 0; i < numA; i++) {
            BigInteger number = new BigInteger(br.readLine());
            sum = sum.add(number);

            if (sum.equals(BigInteger.valueOf(0))) {
                answer = "0";
            } else if (sum.compareTo(BigInteger.valueOf(0)) == 1) {
                answer = "+";
            } else {
                answer = "-";
            }
        }

        sb.append(answer).append("\n");

        int numB = Integer.parseInt(br.readLine());
        sum = BigInteger.valueOf(0);
        answer = "";

        for (int i = 0; i < numB; i++) {
            BigInteger number = new BigInteger(br.readLine());
            sum = sum.add(number);

            if (sum.equals(BigInteger.valueOf(0))) {
                answer = "0";
            } else if (sum.compareTo(BigInteger.valueOf(0)) == 1) {
                answer = "+";
            } else {
                answer = "-";
            }
        }

        sb.append(answer).append("\n");

        int numC = Integer.parseInt(br.readLine());
        sum = BigInteger.valueOf(0);
        answer = "";

        for (int i = 0; i < numC; i++) {
            BigInteger number = new BigInteger(br.readLine());
            sum = sum.add(number);

            if (sum.equals(BigInteger.valueOf(0))) {
                answer = "0";
            } else if (sum.compareTo(BigInteger.valueOf(0)) == 1) {
                answer = "+";
            } else {
                answer = "-";
            }
        }

        sb.append(answer).append("\n");

        System.out.println(sb.toString());
    }
}