import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            long sqrt = (long)Math.sqrt(n);
            if (sqrt * sqrt == n) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
