import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine().trim());
            if (n <= 2) {
                sb.append(1);
            } else {
                sb.append(3);
            }
            if (i + 1 < t) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
