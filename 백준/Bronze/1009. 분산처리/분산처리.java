import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long result = 1;

            for (int j = 0; j < b; j++) {
                result = (result * a) % 10;
            }
            if (result == 0) {
                result = 10;
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());

    }
}
