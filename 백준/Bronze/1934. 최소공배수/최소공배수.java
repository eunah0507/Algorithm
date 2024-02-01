import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 최소 공배수 구하는 문제

        // for문을 돌려서 A와 B를 받는다.
        // 다시 for문을 돌려서 A와 B의 공통약수를 구하고 A와B를 j로 나눈다.
        // 그리고 공통약수는 중첩해서 곱해둔다.
        // 공통약수 * 나눈 A * 나눈 B를 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int answer = 1;

            for (int j = Math.max(A,B); j > 1; j--) {
                if (A % j == 0 && B % j == 0) {
                    A /= j ;
                    B /= j ;
                    answer *= j;
                }
            }

            answer *= A * B;
            sb.append(answer);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}