import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> cntByType = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // name
                String type = st.nextToken();
                cntByType.put(type, cntByType.getOrDefault(type, 0) + 1);
            }

            long ways = 1;
            for (int cnt : cntByType.values()) {
                ways *= (cnt + 1L);
            }
            ways -= 1;

            sb.append(ways);
            if (tc + 1 < t) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
