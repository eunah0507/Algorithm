import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        BigInteger sum = A.add(B);
        BigInteger min = A.subtract(B);
        BigInteger mul = A.multiply(B);

        sb.append(sum);
        sb.append("\n");
        sb.append(min);
        sb.append("\n");
        sb.append(mul);

        System.out.println(sb.toString());
    }
}