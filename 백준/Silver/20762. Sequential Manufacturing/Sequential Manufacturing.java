import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long p = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long sum = 0L;
        long max = 0L;

        for (int i = 0; i < n; i++) {
            long t = Long.parseLong(st.nextToken());
            sum += t;
            if (t > max) {
                max = t;
            }
        }

        long answer = sum + (p - 1L) * max;
        sb.append(answer);

        System.out.print(sb.toString());
    }
}