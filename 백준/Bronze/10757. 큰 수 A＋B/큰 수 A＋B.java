import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 큰 수 A+B 하기

        // int나 long으로 받을 수 없으니 BigInteger를 활용한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        BigInteger numA = sc.nextBigInteger();
        BigInteger numB = sc.nextBigInteger();

        BigInteger answer = numA.add(numB);

        sb.append(answer);
        System.out.println(sb.toString());

    }
}