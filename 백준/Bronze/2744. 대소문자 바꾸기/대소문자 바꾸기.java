import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 소문자는 대문자로, 대문자는 소문자로 변환하는 문제

        // String으로 입력받은 후 charAt(i)로 돌린다

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            if (word >= 'A' && word <= 'Z') {
                sb.append(Character.toLowerCase(word));
            } else {
                sb.append(Character.toUpperCase(word));
            }
        }

        System.out.println(sb.toString());
    }
}