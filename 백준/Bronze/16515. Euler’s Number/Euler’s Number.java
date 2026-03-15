import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term /= i;
            sum += term;
            if (term == 0.0) {
                break;
            }
        }

        sb.append(sum);
        System.out.print(sb.toString());
    }
}