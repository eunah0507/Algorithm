import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long h = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long sum = 0L;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(st.nextToken());
            if (sum >= h) {
                continue;
            }
            sum += d;
            count++;
        }

        if (sum < h) {
            sb.append(-1);
        } else {
            sb.append(count);
        }

        System.out.println(sb.toString());
    }
}
