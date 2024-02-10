import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String input = sc.next();
        long tmp = 0;

        for (int i = 0; i < input.length(); i++) {
            tmp = (tmp * 10 + (input.charAt(i) - '0')) % 20000303;
        }

        sb.append(tmp);
        System.out.println(sb.toString());
    }
}
