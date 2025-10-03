import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            boolean sameX = ((a >> 2) & 1) == ((b >> 2) & 1) && ((a >> 2) & 1) == ((c >> 2) & 1) && ((a >> 2) & 1) == ((d >> 2) & 1);
            boolean sameY = ((a >> 1) & 1) == ((b >> 1) & 1) && ((a >> 1) & 1) == ((c >> 1) & 1) && ((a >> 1) & 1) == ((d >> 1) & 1);
            boolean sameZ = (a & 1) == (b & 1) && (a & 1) == (c & 1) && (a & 1) == (d & 1);

            String answer = (sameX || sameY || sameZ) ? "YES" : "NO";
            sb.append(answer);
            if (t + 1 < T) sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
