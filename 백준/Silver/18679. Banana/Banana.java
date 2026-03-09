import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.split(" = ");
            map.put(parts[0], parts[1]);
        }

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < k; i++) {
                sb.append(map.get(st.nextToken()));
                if (i < k - 1) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}