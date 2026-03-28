import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int total = r + b;

        for (int w = 3; w * w <= total; w++) {
            if (total % w == 0) {
                int l = total / w;

                if ((l - 2) * (w - 2) == b) {
                    sb.append(Math.max(l, w)).append(' ').append(Math.min(l, w));
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}