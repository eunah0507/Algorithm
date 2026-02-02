import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long prevSum = 0;

        for (int i = 1; i <= n; i++) {
            long b = Long.parseLong(st.nextToken());
            long sum = b * i;
            long a = sum - prevSum;
            prevSum = sum;

            if (i > 1) {
                sb.append(' ');
            }
            sb.append(a);
        }

        System.out.println(sb.toString());
    }
}
