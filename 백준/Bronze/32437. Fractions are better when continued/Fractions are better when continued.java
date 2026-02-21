import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        int target = n + 1;

        long a = 1L;
        long b = 1L;

        if (target == 1) {
            sb.append(a);
        } else if (target == 2) {
            sb.append(b);
        } else {
            for (int i = 3; i <= target; i++) {
                long c = a + b;
                a = b;
                b = c;
            }
            sb.append(b);
        }

        System.out.print(sb.toString());
    }
}