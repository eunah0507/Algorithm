import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long result = 1;
        a %= c;

        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a % c;
            }

            a = a * a % c;
            b /= 2;
        }

        sb.append(result);
        System.out.print(sb.toString());
    }
}