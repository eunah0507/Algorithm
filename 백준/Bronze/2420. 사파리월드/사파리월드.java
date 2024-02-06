import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 절대값 활용하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long N = sc.nextLong();
        long M = sc.nextLong();
        long answer = Math.abs(N-M);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}