import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 돈 n을 m명이서 나눌 때, 한 사람당 얼마씩 받을 수 있나?

        // 두 케이스를 int로 입력받는다.
        // 답을 출력할 변수를 만든 후, n / m한다.
        // 다른 답에는 n % m 한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger answer = n.divide(m);
        BigInteger answer2 = n.remainder(m);

        sb.append(answer);
        sb.append("\n");
        sb.append(answer2);

        System.out.println(sb.toString());

        sc.close();
    }
}