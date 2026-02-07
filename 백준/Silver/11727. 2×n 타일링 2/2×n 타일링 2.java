import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        int mod = 10007;

        if (n == 1) {
            sb.append(1);
            System.out.print(sb.toString());
            return;
        }

        int a = 1; 
        int b = 3; 

        for (int i = 3; i <= n; i++) {
            int c = (b + (2 * a) % mod) % mod; 
            a = b;
            b = c;
        }

        sb.append(b);
        System.out.print(sb.toString());
    }
}
