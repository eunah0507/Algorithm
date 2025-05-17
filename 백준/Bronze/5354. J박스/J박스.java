import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j == 0 || j == n - 1 || k == 0 || k == n - 1) {
                        sb.append('#');
                    } else {
                        sb.append('J');
                    }
                }
                sb.append('\n');
            }

            if (i < num - 1) {
                sb.append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}
