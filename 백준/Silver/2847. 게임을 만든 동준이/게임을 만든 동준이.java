import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] levels = new int[N];
        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = N - 2; i >= 0; i--) {
            if (levels[i] >= levels[i + 1]) {
                int diff = levels[i] - (levels[i + 1] - 1);
                count += diff;
                levels[i] = levels[i + 1] - 1;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
