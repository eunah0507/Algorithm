import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 서로 다른 부분 문자열의 개수 파악하기
        // 공식 : (N + N-1 + ... + 1) - 중복 제거

        // 테스트케이스를 String에 넣는다.
        // charAt()을 써서 한 문자씩 배열을 만들어 넣는다.
        // 2중 for문을 돌려 한 글자당 시작하는 모든 경우의 수를 set에 넣는다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String S = sc.next();
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < S.length(); i++) {
            String ch = "" + S.charAt(i);
            set.add(ch);

            for (int j = i+1; j < S.length(); j++) {
                ch += S.charAt(j);
                set.add(ch);
            }
        }

        sb.append(set.size());
        System.out.println(sb.toString());
    }
}