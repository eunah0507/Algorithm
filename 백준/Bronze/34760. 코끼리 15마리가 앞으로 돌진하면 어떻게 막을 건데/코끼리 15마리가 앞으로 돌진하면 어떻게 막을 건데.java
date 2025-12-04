import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        long maxFirst = 0L;
        long last = 0L;

        for (int i = 1; i <= 15; i++) {
            long x = Long.parseLong(st.nextToken());
            if (i < 15) {
                if (x > maxFirst) {
                    maxFirst = x;
                }
            } else {
                last = x;
            }
        }

        long ans = maxFirst + 1;
        if (ans < last) {
            ans = last;
        }

        sb.append(ans);
        System.out.print(sb.toString());
    }
}
