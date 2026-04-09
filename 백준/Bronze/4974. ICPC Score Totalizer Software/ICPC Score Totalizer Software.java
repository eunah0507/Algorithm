import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            int[] scores = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(br.readLine());
                sum += scores[i];
            }

            Arrays.sort(scores);
            sum -= scores[0];
            sum -= scores[n - 1];

            sb.append(sum / (n - 2)).append('\n');
        }

        System.out.print(sb.toString());
    }
}