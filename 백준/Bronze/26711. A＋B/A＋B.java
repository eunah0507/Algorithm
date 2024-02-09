import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받은 두 수 더하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        BigInteger numA = sc.nextBigInteger();
        BigInteger numB = sc.nextBigInteger();
        
        sb.append(numA.add(numB));
        System.out.println(sb.toString());

    }
}
