import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            long normal = Long.parseLong(A) * Long.parseLong(B);
            String normalStr = String.valueOf(normal);

            int lenA = A.length();
            int lenB = B.length();
            int minLen = Math.min(lenA, lenB);
            int offA = lenA - minLen;
            int offB = lenB - minLen;

            StringBuilder wrong = new StringBuilder();
            if (offA > 0) {
                wrong.append(A, 0, offA);
            } else if (offB > 0) {
                wrong.append(B, 0, offB);
            }

            for (int i = 0; i < minLen; i++) {
                int da = A.charAt(offA + i) - '0';
                int db = B.charAt(offB + i) - '0';
                int prod = da * db;
                wrong.append(prod);
            }

            if (wrong.toString().equals(normalStr)) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            if (tc + 1 < T) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
